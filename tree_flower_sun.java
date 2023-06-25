import java.util.List; 
import java.util.ArrayList; 

public class InnovationAndCreativityWorkshops { 

	public static void main(String[] args) { 
		
		List<Integer> workshopIds = new ArrayList<Integer>(); 

		//populating workshopIds list
		workshopIds.add(1001); 
		workshopIds.add(1002); 
		workshopIds.add(1003);  

		//creating workshop object		
		Workshop ws1 = new Workshop(workshopIds.get(0), "Innovation and Creativity for Startups"); 
		Workshop ws2 = new Workshop(workshopIds.get(1), "Design Thinking and Innovation");  
		Workshop ws3 = new Workshop(workshopIds.get(2), "Creativity and Entrepreneurship"); 
		
		//creating list of workshops
		List<Workshop> workshops = new ArrayList<Workshop>();
		workshops.add(ws1);
		workshops.add(ws2);
		workshops.add(ws3);
		
		//creating user objects
		User u1 = new User("John Doe", 25); 
		User u2 = new User("Jen Smith", 29);
		
		//creating list of users
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		
		//creating workshop manager object
		WorkshopManager wm = new WorkshopManager(workshops);
		
		//invoking registerForWorkshops 
		wm.registerForWorkshops(users);		
		
		
	}
	
}

//workshop class
class Workshop {

	private int id; 
	private String name; 
	
	public Workshop(int id, String name) { 
		this.id = id; 
		this.name = name; 
	}
	
	public int getId() { 
		return this.id; 
	}
	
	public void setId(int id) { 
		this.id = id; 
	}
	
	public String getName() { 
		return this.name; 
	}
	
	public void setName(String name) { 
		this.name = name; 
	}
	
}

//user class
class User {

	private String name; 
	private int age; 
	
	public User(String name, int age) { 
		this.name = name; 
		this.age = age; 
	}
	
	public String getName() { 
		return this.name; 
	}
	
	public void setName(String name) { 
		this.name = name; 
	}
	
	public int getAge() { 
		return this.age; 
	}
	
	public void setAge(int age) { 
		this.age = age; 
	}
	
}

//workshop manager class
class WorkshopManager {

	private List<Workshop> workshops; 
	
	public WorkshopManager(List<Workshop> workshops) { 
		this.workshops = workshops; 
	}
	
	public List<Workshop> getWorkshops() { 
		return this.workshops; 
	}
	
	public void registerForWorkshops(List<User> users) { 
		//iterating through users
		for(User user : users) {
			System.out.print(user.getName() + " is registering for the following workshops: ");
			//Iterating through workshops
			for (Workshop workshop : workshops) {
				//displaying workshop details
				System.out.print("\t" + workshop.getName() + " (ID: " + workshop.getId() +")");
			}
			System.out.println(); 
		}
		
	}
}