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
	
}

