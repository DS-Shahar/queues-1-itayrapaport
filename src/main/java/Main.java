package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> p= new Queue<>();
		p.insert(1);
		p.insert(1);
		p.insert(3);
		p.insert(2);
		p.insert(6);
		System.out.println(p);
		SortQueue(p);
		System.out.println(p);

	}
	public static boolean IsIn(Queue<Integer> q , int num) {
		boolean flag= false;
		Queue<Integer> q_2= new Queue<>();
		while(!q.isEmpty()) {
			
			q_2.insert(q.head());
			q.remove();
		}
		
		while(!q_2.isEmpty()) {
			if(q_2.head()==num) {
				flag= true;
				
			}
			q.insert(q_2.head());
			q_2.remove();
			
		}
		return flag;
	}
	public static boolean IsInString(Queue<String> q , String num) {
		boolean flag= false;
		Queue<String> q_2= new Queue<>();
		while(!q.isEmpty()) {
			
			q_2.insert(q.head());
			q.remove();
		}
		
		while(!q_2.isEmpty()) {
			if((q_2.head()).equals(num)){
				flag= true;
				
			}
			q.insert(q_2.head());
			q_2.remove();
			
		}
		return flag;
	}
	
	public static boolean IsInNull(Queue<Integer> q , int num) {
		boolean flag= false;
		Queue<Integer> q_2= new Queue<>();
		while(!q.isEmpty()) {
			
			q_2.insert(q.head());
			q.remove();
		}
		q_2.insert(null);
		while(q_2.head()!=null) {
			if(q_2.head()==num) {
				flag=true;
			}
			
			q.insert(q_2.head());
			q_2.remove();
		}
		return flag;
	}
	public static boolean IsInNullRecursion(Queue<Integer> q , int num) {
		if(q.isEmpty()) {
			return false;
		}
		int a= q.remove();
		boolean found= IsInNullRecursion(q, num);
		q.insert(a);
		
		
		return found || (a==num);
	}
	public static Queue<Integer> q_6(Queue<Character> q){ ////o(n)
		Queue<Character> q2= new Queue<>();
		while(!q.isEmpty()) {
			
			q2.insert(q.head());
			q.remove();
		}
		Queue<Integer> qChar= new Queue<>();
		int count= 1;
		char prev= q2.head();
		q.insert(q2.head());
		q2.remove();
		while(!q2.isEmpty()) {
			if(prev!=q2.head()) {
				qChar.insert(count);
				count=1;
			}
			else {
				count++;
			}
			prev= q2.head();
			q.insert(q2.head());
			q2.remove();
		}
		qChar.insert(count);
		
		return qChar;
	}
	public static boolean q_7IsRep(Queue<String> q) {////o(n^2)
		boolean flag= false;
		Queue<String> q2= new Queue<>();
		while(!q.isEmpty()) {
			
			q2.insert(q.head());
			q.remove();
		}
		while(!q2.isEmpty()) {
			String a= q2.head();
			q.insert(q2.head());
			q2.remove();
			if(IsInString(q2,a)) {
				flag= true;
			}
		}
		return flag;
		
	}
	public static void q_8RemoveRep(Queue<Integer> q) {
		Queue<Integer> q2= new Queue<>();
		while(!q.isEmpty()) {
			
			q2.insert(q.head());
			q.remove();
		}
		
		while(!q2.isEmpty()) {
			if(!IsIn(q, q2.head())) {
				q.insert(q2.head());
			}
			q2.remove();
		}
		
	}
	public static void SortQueue(Queue<Integer> q) {
		Queue<Integer> q2= new Queue<>();
		Queue<Integer> q3= new Queue<>();
		
		while(!q.isEmpty()) {
		int min= q.head();
		boolean flag= false;

		while(!q.isEmpty()) {
			
			q2.insert(q.head());
			if(q.head()<min) {
				min= q.head();
			}
			q.remove();
		}
		while(!q2.isEmpty()) {
			if(q2.head()==min&&flag== false) {
				q3.insert(q2.head());
				flag= true;
				
			}
			else {
			q.insert(q2.head());
			}
			q2.remove();
		}
		}
		while(!q3.isEmpty()) {
			
			q.insert(q3.head());
			q3.remove();
		}
		
		
		

	}
	public class Time {
	private int hour;
	private int minute;
	private int second;
    public Time(int hours, int minutes, int seconds) {
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
    }
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
	

	}
	public class isConsecutivelyRepeated {
	//פעולה שמקבלת תור ומספר ומחזירה האם הוא מופיע יותר מפעמיים ברצף
	public static boolean isConsecutivelyRepeated(Queue<Integer> q,int number) {
		boolean flag = false;
		Queue<Integer> q1 = new Queue<>();
		while (!q.isEmpty()) {
			if (q.head() == number ) {
					if (q.head() == number) {
						flag = true;
					}				
			}
			q1.insert(q.remove());
			
		}
		while (!q1.isEmpty()) {
			q.insert(q1.remove());
		}
		return flag;
	}
	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
		q1.insert(1);
		
		
		
		System.out.println(q1);
		boolean a = (isConsecutivelyRepeated(q1,1));
		System.out.println(a);
		System.out.println(q1);
		
	}

	}
	public class page_151 {
	//2A - O(1)
	public static Time calcTimeDifference(Queue<Time> q) {
		Time first = q.head();
		Time last = q.head();
		Queue<Time> q1 = new Queue<>();
		while (!q.isEmpty()) {
			last = q.head();
			q1.insert(q.remove());
		}
		while (!q1.isEmpty()) {
			q.insert(q1.remove());
		}
		 int hoursDifference = last.getHour() - first.getHour();
	        int minutesDifference = last.getMinute() - first.getMinute();
	        int secondsDifference = last.getSecond() - first.getSecond();

	        if (secondsDifference < 0) {
	            secondsDifference += 60;  
	            minutesDifference -= 1;
	        }
	        if (minutesDifference < 0) {
	            minutesDifference += 60;  
	            hoursDifference -= 1;
	        }


	        return new Time(hoursDifference, minutesDifference, secondsDifference);
	    }
	//2B
	
	public static void findLowestDifference(Queue<Time> times) {
	    // Assuming at least two elements are present based on your confirmation
	    Time previousTime = times.remove();
	    int minDifference = Integer.MAX_VALUE;
	    int minDiffIndex = 0;
	    int currentIndex = 0;

	    while (!times.isEmpty()) {
	        Time currentTime = times.remove(); // Get and remove the head of the queue
	        int differenceInSeconds = calculateDifferenceInSeconds(previousTime, currentTime);

	        if (differenceInSeconds < minDifference) {
	            minDifference = differenceInSeconds;
	            minDiffIndex = currentIndex; // Store the index where we found the minimum difference
	        }

	        previousTime = currentTime; // Move to the next pair
	        currentIndex++; // Increment the current index for the next iteration
	    }

	    // Output the indexes with the minimum difference, adjusting for 1-based indexing
	    System.out.println((minDiffIndex + 1) + " & " + (minDiffIndex + 2));
	}

	public static int calculateDifferenceInSeconds(Time earlier, Time later) {
	    int earlierInSeconds = earlier.getHour() * 3600 + earlier.getMinute() * 60 + earlier.getSecond();
	    int laterInSeconds = later.getHour() * 3600 + later.getMinute() * 60 + later.getSecond();

	    return laterInSeconds - earlierInSeconds;
	}
	public static void main(String[] args) {
	Time t1 = new Time(10,55,44);
	Time t2 = new Time(11,56,46);
	Time t3 = new Time(11,57,56);
	Time t4 = new Time(11,59,46);

	Queue<Time> q = new Queue<>();
	q.insert(t1);
	q.insert(t2);
	q.insert(t3);
	q.insert(t4);

	findLowestDifference(q);


	}

	}
}

