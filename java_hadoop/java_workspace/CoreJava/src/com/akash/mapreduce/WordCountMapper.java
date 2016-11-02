package com.akash.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	
	private static final int ONE = 1;
	
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		// send key and value to reducer
		
		String line[] = value.toString().split(" ");
		for(int i=0;i<line.length;i++)
			context.write(new Text(line[i]), new IntWritable(ONE));
			
	}

}