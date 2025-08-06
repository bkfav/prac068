import java.util.*; 
import java.io.*; 

class prac15{
	static void revstr(){
		Scanner s = new Scanner(System.in); 
		String str = s.nextLine();
		String revstr = "";
		for(int i=0; i<str.length(); i++)
			revstr = str.charAt(i) + revstr; 
		System.out.println("Given: "+str+"\nReverse: "+revstr); 
		if(str.equalsIgnoreCase(revstr))
			System.out.println("Penlin"); 
		else
			System.out.println("Not Pelin"); 
	}
	static void facto(){
		Scanner s = new Scanner(System.in); 
		int no = s.nextInt(); 
		int tmp = 1; 
		//factorial
		for(int i=no; i>0; i--)
			tmp = i * tmp; 
		System.out.println("Fact of "+no+" = "+tmp);
		//Prime
		System.out.print("Prime Numbers: ");
		for(int i=2; i<=no; i++){
			for(int j=2; j<=i+1; j++)
				if(i%j==0)
					if(i==j)
						System.out.print(i+","); 
					else
						break;
		}
		//fibonanci
		int next=0, prev=1; 
		System.out.print("\nFibonanic Series: "); 
		for(int i=0; i<=no; i++){
			System.out.print(next+",");
			tmp = next + prev; 
			next = prev;
			prev = tmp; 
		}
			
	}
	static void charCount(){
		String s = "adfa@$42@@234", s1 = "WiNdOWs", s2="Hello World!", tmp = "";
		int cch=0, cno=0, csc=0; 
		System.out.println(s+" has");
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i); 
			if(Character.isLetter(ch))
				cch++; 
			else if(Character.isDigit(ch))
				cno++; 
			else
				csc++; 
		}
		System.out.println("Char: "+cch+"\nNo: "+cno+"\nSC: "+csc); 
		for(int i=s1.length()-1; i>=0; i--){
			char ch = s1.charAt(i); 
			if(Character.isUpperCase(ch))
				tmp = Character.toLowerCase(ch) + tmp;
			else if(Character.isLowerCase(ch))
				tmp = Character.toUpperCase(ch) + tmp; 
		}
		System.out.println("Before: "+s1+"\nAfter: "+tmp); 
		System.out.println(s2+" starts with Hello? = "+s2.startsWith("Hello"));
		System.out.println(s2+" ends with World? = "+s2.endsWith("World")); 	
	}
	static void sortarray(){
		int sort[] = {15,14,13,12,11};
		int dup[] = {1,2,3,1,2,3,4,3};
		String s = "aabbccddde";
		char ch[] = s.toCharArray(); 
		System.out.print("Sorted Array: ");
		for(int i=0; i<sort.length; i++){
			for(int j=i+1; j<sort.length; j++)
				if(sort[i] > sort[j]){
					int tmp = sort[i]; 
					sort[i] = sort[j]; 
					sort[j] = tmp; 
				}
			System.out.print(sort[i]+",");				
		}
		System.out.print("\nNo dup in array: ");
		for(int i=0; i<dup.length; i++){
			for(int j=i+1; j<dup.length; j++)
				if(dup[i] == dup[j]){
					dup[j] = 0; 
				}
			if(dup[i] !=0)
			System.out.print(dup[i]+",");				
		}
		System.out.println("\nFreq. of char of given text: "+s); 
		for(int i=0; i<ch.length; i++){
			int count=1;
			for(int j=i+1; j<ch.length; j++)
				if(ch[i]==ch[j]){
					count++; 
					ch[j]='\0';
				}
			if(ch[i]!='\0')
			System.out.println(ch[i]+" = "+count); 
		}		
		
	}
	static void charfreq(){
		String s1="Hello", s2="World"; 
		int a=5, b=10, len=s1.length();
		a = a+b; 
		b = a-b; 
		a = a-b; 
		s1 = s1+s2; 
		s2 = s1.substring(0,len); 
		s1 = s1.substring(len); 
		System.out.println(a+","+b+","+s1+","+s2); 
	}
	static void fileops(){
		try{
			File file = new File("C:\\Users\\KN00832612\\Documents\\Test files\\test.txt"); 
			if(file.createNewFile())
				System.out.println("New File Created");
			else
				System.out.println("File Already Existed"); 
			
			FileWriter writer = new FileWriter(file); 
			writer.write("test data 6th Aug"); 
			writer.close(); 
			
			FileReader reader = new FileReader(file); 
			int c=0;
			while((c=reader.read()) != -1)
				System.out.print((char)c); 
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage()); 
		}
	}
	public static void main(String[] args){
		revstr();	
		//facto(); 
		//prime();
		//fibonanci();
		//charCount();
		//upperlower();
		//startwith();
		//sortarray();		
		//dupary();
		//swapnotext();
		//charfreq();
		fileops();
	}
}
