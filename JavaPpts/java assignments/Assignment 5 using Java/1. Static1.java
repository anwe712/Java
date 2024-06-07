//WAP in Java implementing static keyword.
public class Static1 
{
	static int count = 0;
	int instanceCount = 0;
    	static void incrementCount() 
	{
		count++;
   	}
   	void incrementInstanceCount() 
	{
        	instanceCount++;
    	}
   	public static void main(String[] args) 
	{
       		System.out.println("Initial count: " + count); 
        	incrementCount(); // Incrementing static count
        	System.out.println("Count after incrementing: " + count); 

	        Static1 obj1 = new Static1();
        	Static1 obj2 = new Static1();
        
        
        	System.out.println("Count via obj1: " + obj1.count); 
        
        	System.out.println("Instance count for obj1: " + obj1.instanceCount); 
		obj1.incrementInstanceCount(); 
		System.out.println("Instance count for obj1 after incrementing: " + obj1.instanceCount); 
        
       		System.out.println("Count via obj2: " + obj2.count); 
        	System.out.println("Instance count for obj2: " + obj2.instanceCount); 
    	}
}
