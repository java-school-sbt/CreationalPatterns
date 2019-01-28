package common.sup.da.v2;

import common.sup.entity.template.v2.Fallback;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JsonParameterSerializeReader {
	
	public Fallback customSerializeReader(String filename) throws IOException, ClassNotFoundException {
		try (FileInputStream fos = new FileInputStream(filename)){
			try (ObjectInputStream oos = new ObjectInputStream(fos)){
				return (Fallback)oos.readObject();
			}
		}
	}
	
}
