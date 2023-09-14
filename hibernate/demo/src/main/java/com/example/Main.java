package com.example;

import java.util.HashMap;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

public class Main {
    static Gson gson;
    static Session session;
    static Configuration configuration;
    static SessionFactory sessionFactory;

    static {
        gson = new Gson();
        configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
    }

    public static void main(String[] args) {
        session.beginTransaction();

        // add();
        // update();
        // delete();

        // addEmp();
        updateEmp();
        // deleteEmp();
        session.getTransaction().commit();

    }

    public static HashMap<String, Object> stringToMap(String data) throws IOException {
        // ObjectMapper mapper = new ObjectMapper();

        // TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
        // };
        // return  mapper.readValue(data, typeRef);

        return gson.fromJson(data, HashMap.class); // converting number to float or double
    }

    public static String mapToString(HashMap<String, Object> data) throws IOException {
        // ObjectMapper mapper = new ObjectMapper();
        // return mapper.writerWithDefaultPrettyPrinter()
        // .writeValueAsString(data);
        return gson.toJson(data);

    }


    public static void addEmp() {
        String s = "{\"emp\":1, \"doj\":22}";
        Employee e1 = new Employee();

        e1.setId(6);
        e1.setFirstName("cc");
        e1.setLastName("bb");
        e1.setData(s.getBytes());
        session.save(e1);
    }

    public static byte[] getEmp(int num) {
        Employee s1 = session.get(Employee.class, num);
        return s1.getData();
    }

    public static void updateEmp() {
        Employee s1 = session.get(Employee.class, 6);

        try {
            HashMap<String, Object> value = stringToMap((new String(s1.getData())));
            value.put("emp", 27);
            s1.setData(mapToString(value).getBytes());
            session.save(s1);
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
    }

    public static void deleteEmp() {
        Employee s1 = session.get(Employee.class, 5);
        session.delete(s1);
    }

    public static void add() {

        String s = "{\"a:\":27, \"b\":2}";

        Song song1 = new Song();
        song1.setId(5);
        song1.setSongName("qqq");
        song1.setSinger("aa");
        song1.setData(s.getBytes());
        session.save(song1);
    }

    public static void update() {
        Song s1 = session.get(Song.class, 5);

        try {
            HashMap<String, Object> value = stringToMap((new String(s1.getData())));
            value.put("a", 27);
            s1.setData(mapToString(value).getBytes());
            session.save(s1);
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
    }

    public static void delete() {
        Song s1 = session.get(Song.class, 3);
        session.delete(s1);
    }
}