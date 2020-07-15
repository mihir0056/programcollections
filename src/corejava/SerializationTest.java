package corejava;

import java.io.*;

public class SerializationTest {

    public static void main(String[] args) {
        ConnectionFactory INSTANCE = ConnectionFactory.getIntance();

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("connectFactory.ser"));
            oos.writeObject(INSTANCE);
            oos.close();

            ObjectInputStream osi = new ObjectInputStream(new FileInputStream("connectFactory.ser"));
            ConnectionFactory factory1 = (ConnectionFactory) osi.readObject();
            osi.close();

            ObjectInputStream osi2 = new ObjectInputStream(new FileInputStream("connectFactory.ser"));
            ConnectionFactory factory2 = (ConnectionFactory) osi2.readObject();
            osi2.close();


            System.out.println("Instance reference check->" + factory1.getIntance());
            System.out.println("Instance reference check->" + factory2.getIntance());
            System.out.println("===================================================");
            System.out.println("Object reference check->" + factory1);
            System.out.println("Object reference check->" + factory2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
