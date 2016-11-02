package com.akash;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

public class ReadConfigXML {

	public static void main(String[] args) {
		
		String p = "/home/gradea/config.xml";
		Path path = new Path(p);
		
		Configuration conf  = new Configuration();
		conf.addResource(path);
		
		System.out.println(conf.get("color"));
		System.out.println(conf.getInt("size",1));
		
		
	}

}
