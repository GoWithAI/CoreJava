package design.designPattern.singleton.avoidCloning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class AvoidWhileSerializationDeserilization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Singleton instance1 = Singleton.singleton;
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(instance1);//serialize
		out.close();

		// deserialize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

		Singleton instance2 = (Singleton) in.readObject();//deserialize
		in.close();
	}

}
