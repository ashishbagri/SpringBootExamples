package in.codeangles.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.codeangles.springboot.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(

			new Topic(1, "Ashish", "Description1"), new Topic(3, "ABc", "Description2"),
			new Topic(2, "XYZ", "Description3"), new Topic(4, "ASDAS", "Description4")));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(int id){
		return topics.stream().filter(t->t.getId()==id).findFirst().get();
		
	}
	
	public void add(Topic topic){
		topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {
		for(int i=0;i<topics.size();i++){
			if(topics.get(i).getId()==id){
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(int id) {
		
		topics.removeIf(t->t.getId()==id);
	}
}
