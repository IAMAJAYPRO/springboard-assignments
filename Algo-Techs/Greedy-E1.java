class Tester {

	public static int findMaxActivities(int start[], int finish[]) { 
        int ct=0,end=0,i;
        for (i=0;i<finish.length;i++){
            if (start[i]>=end){
                end=finish[i];
                ct++;
            }
        }
        return ct;
        //Implement your logic here and change the return statement accordingly
		
	} 
	       
	public static void main(String[] args) { 
        int start[] =  {1, 3, 0, 5, 8, 5}; 
    	int finish[] =  {2, 4, 6, 7, 9, 9};
    	    
    	System.out.println("Maximum number of activities: "+findMaxActivities(start, finish)); 
    }
}
