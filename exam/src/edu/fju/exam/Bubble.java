package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers1 = { 45, 81, 9, 72, 4, 6};
		 int temp1;
		 
		 for(int a=1;;a++)
		 {
			 for(int b=0;b<numbers1.length-1;b++)
			 {
					if(numbers1[b]<=numbers1[b+1])
					{
						temp1=numbers1[b];
						numbers1[b]=numbers1[b+1];
						numbers1[b+1]=temp1;
					}
					

			 }
				if(numbers1[0]>=numbers1[1] && numbers1[1]>=numbers1[2] && numbers1[2]>=numbers1[3] && numbers1[3]>=numbers1[4] && numbers1[4]>=numbers1[5])
				{
					break;
				}
		 }
		 
			System.out.print("<strong>"+numbers1[0]+" "+numbers1[1]+" "+numbers1[2]+" "+numbers1[3]+" "+numbers1[4]+" "+numbers1[5]+"</strong>");   
			System.out.println();
	
			int[] numbers2 = { 6, 5, 2, 8, 1, 9, 13, 4, 11, 7}; 
			 int temp2;
			 
			 for(int c=1;;c++)
			 {
				 for(int d=0;d<numbers2.length-1;d++)
				 {
						if(numbers2[d]<=numbers2[d+1])
						{
							temp2=numbers2[d];
							numbers2[d]=numbers2[d+1];
							numbers2[d+1]=temp2;
						}
						

				 }
					if(numbers2[0]>=numbers2[1] && numbers2[1]>=numbers2[2] && numbers2[2]>=numbers2[3] && numbers2[3]>=numbers2[4] && numbers2[4]>=numbers2[5] && numbers2[5]>=numbers2[6] && numbers2[6]>=numbers2[7] && numbers2[7]>=numbers2[8] && numbers2[8]>=numbers2[9])
					{
						break;
					}
			 }
			 
				System.out.print("<strong>"+numbers2[0]+" "+numbers2[1]+" "+numbers2[2]+" "+numbers2[3]+" "+numbers2[4]+" "+numbers2[5]+" "+numbers2[6]+" "+numbers2[7]+" "+numbers2[8]+" "+numbers2[9]+"</strong>");   
	}

}
