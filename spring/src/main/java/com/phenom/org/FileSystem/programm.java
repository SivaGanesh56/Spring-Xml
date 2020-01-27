package com.phenom.org.FileSystem;

public class programm 
{
	public static int shortestDistance(String s ,int src ,int des)
	{
		
		int n =(int) Math.sqrt((s.length()+1)/2);
		int [][] a = new int[n+1][n+1];
		s.concat(" ");
		char b[] = s.toCharArray();
		int k=0;
		for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 a[i][j]=b[k]-48;
				 k+=2;
			 }
		 }
		 int [] dist = new int [n+1];
		 boolean [] visited = new boolean[n+1];
		 for (int i =1;i<=n;i++)
		 { 
	        dist[i] = Integer.MAX_VALUE; 
	        visited[i] = false; 
	     } 
		 dist[src]=0;
		 for(int i=1;i<=n;i++)
		 {
			 int u= Minima.minDistance(dist,visited,n);
			 visited[u] = true;
	         for (int v = 1;v<= n;v++)
	         {
	                if (!visited[v] && a[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + a[u][v] < dist[v])
	                {
	                    dist[v] = dist[u] + a[u][v]; 
	                }
	         }
		 }
		 return dist[des];
	}
	
	public static void main(String[] args) {
		/////
		String s ="0 6 0 1 0 6 0 5 0 2 0 5 0 0 5 1 0 0 0 1 0 2 5 1 0";
		int result=shortestDistance(s, 3, 1);
		System.out.println(result);
	}

}


class Minima
{
	public static int  minDistance(int []dist,boolean[] visited,int n)
	{
        int min = Integer.MAX_VALUE, min_index = -1; 
        for (int v = 1; v <=n ; v++) 
        {
            if (visited[v] == false && dist[v] <= min) 
            { 
                min = dist[v]; 
                min_index = v; 
            }
        }
        return min_index; 
    } 
}
