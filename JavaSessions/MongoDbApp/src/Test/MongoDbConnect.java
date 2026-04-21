package Test;

import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDbConnect {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient( "localhost" , 27017 ); // should use this always		
		List<String> dbs = mongoClient.getDatabaseNames();
		System.out.println(dbs); // [journaldev, local, admin]
		DB db = mongoClient.getDB("DemoDb");
		
		Set<String> collections = db.getCollectionNames();
		System.out.println(collections); // [datas, names, system.indexes, users]
		
		DBCollection col = db.getCollection("Employee");
		System.out.println(col);
	}
}
