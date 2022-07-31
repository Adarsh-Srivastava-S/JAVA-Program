package p1;
import java.util.Scanner;
public class VowelConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String:");
		
		Scanner sc=new Scanner(System.in);
		String q=sc.nextLine();
		int vowel=0,consonant=0,digit=0,sum=0,spcl=0;
		for(int i=0;i<q.length();i++)
		{
			char ch=q.charAt(i);
			int a=(int)ch;
			
			
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				vowel++;
			}
			else if(a>=48&&a<=57)
			{
				
				digit++;
				sum=sum+Character.getNumericValue(ch);
			}
			else if((ch!='a'&&ch!='A'&&ch!='e'&&ch!='E'&&ch!='i'&&ch!='I'&&ch!='o'&&ch!='O'&&ch!='u'&&ch!='U')&&((a>=65&&a<=90)||(a>=97&&a<=122)))
			{		
				consonant++;
				
			}
			else
			{
				spcl++;
			}
		}
		System.out.println("Number of vowel:"+vowel);

		System.out.println("Number of digit:"+digit );

		System.out.println("Sum of digit:"+sum );

		System.out.println("Number of consonants:"+consonant );

		System.out.println("Number of special Character :"+spcl);
		
		sc.close();
		
	}

}
