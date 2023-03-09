package Project_SDNL;

import java.util.List;
import java.util.Scanner;
import static Project_SDNL.Dijkstra.computePaths;
import static Project_SDNL.Dijkstra.getShortestPathTo;

public class mainKelas {

    public static void main(String[] args) {
        Vertex v0 = new Vertex("Kost Putri 126");
        Vertex v1 = new Vertex("Kost YS Smile");
        Vertex v2 = new Vertex("Kost Majus");
        Vertex v3 = new Vertex("Kost Putra Wisma");
        Vertex v4 = new Vertex("Kost Biru");
        Vertex v5 = new Vertex("Kost Hijau");
        Vertex v6 = new Vertex("Kost Putih");

        v0.adjacencies = new Edge[]{
            new Edge(v1, 5),
            new Edge(v2, 10),
            new Edge(v3, 8),
            new Edge(v5,4)};
        v1.adjacencies = new Edge[]{
            new Edge(v0, 5),
            new Edge(v2, 3),
            new Edge(v4, 7),
            new Edge(v5, 6),
            new Edge(v6, 8)};
        v2.adjacencies = new Edge[]{
            new Edge(v0, 10),
            new Edge(v1, 3),
            new Edge(v6, 7)};
        v3.adjacencies = new Edge[]{
            new Edge(v0, 8),
            new Edge(v4, 2),
            new Edge(v5, 5)};
        v4.adjacencies = new Edge[]{
            new Edge(v1, 7),
            new Edge(v3, 2),
            new Edge(v5, 12)};
        v5.adjacencies=new Edge[]{
            new Edge(v0,4),
            new Edge(v1,6),
            new Edge(v3,5),
            new Edge(v4,12)};
        v6.adjacencies=new Edge[]{
            new Edge(v1,8),
            new Edge(v2,7)};
        
        Vertex[] vertices = {v0, v1, v2, v3, v4,v5,v6};
        
        

        Scanner kelompokEmpat=new Scanner(System.in);
        System.out.print("Masukan kost asal (Kost putri 126/kost YS Smile/Kost Majus/kost Putra Wisma/Kost Biru/Kost Hijau/Kost Putih : ");
        String kosAsal=kelompokEmpat.nextLine();
        if(kosAsal.equalsIgnoreCase("Kost Putri 126")){
            computePaths(v0);
            for(Vertex v : vertices){
                System.out.println("Jarak ke "+v+ " adalah "+v.minDistance+ " Km dari  " +v0);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kost yang dilalui "+path);
                System.out.println("----------------------------------------------------");
                System.out.println("                                                     ");
        }
        } else if(kosAsal.equalsIgnoreCase("Kost YS Smile")){
            computePaths(v1);
            for(Vertex v:vertices){
                    System.out.println("Jarak ke  "+v+" adalah "+v.minDistance+ " Km dari  " +v1);
                    List<Vertex> path = getShortestPathTo(v);
                    System.out.println("Kost yang dilalui "+path);
                    System.out.println("---------------------------------------------------");
                    System.out.println("                                                    ");
            }
        }else if(kosAsal.equalsIgnoreCase("Kost Majus")){
            computePaths(v2);
            for(Vertex v:vertices){
                System.out.println("Jarak ke  "+v+" adalah "+v.minDistance+ " Km dari  " +v2);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kost yang dilalui "+path);   
                System.out.println("-----------------------------------------------------");
                System.out.println("                                                      ");
            }
        }else if(kosAsal.equalsIgnoreCase("Kost Putra Wisma")){
            computePaths(v3);
            for(Vertex v:vertices){
                System.out.println("Jarak ke  "+v+" adalah "+v.minDistance+ " Km dari  " +v3);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kost yang dilalui "+path);
                System.out.println("------------------------------------------------------");
                System.out.println("                                                      ");
        }
        }else if(kosAsal.equalsIgnoreCase("Kost Biru")){
            computePaths(v4);
            for(Vertex v:vertices){
                System.out.println("Jarak ke  "+v+" adalah "+v.minDistance+ " Km dari  " +v4);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kost yang dilalui "+path);
                System.out.println("-----------------------------------------------------");
                System.out.println("                                                      ");
        }
        }else if(kosAsal.equalsIgnoreCase("Kost Hijau")){
            computePaths(v5);
            for(Vertex v:vertices){
                System.out.println("Jarak ke  "+v+" adalah "+v.minDistance+ " Km dari  " +v5);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kost yang dilalui "+path);
                System.out.println("---------------------------------------------------");
                System.out.println("                                                   ");
        }
        }else if(kosAsal.equalsIgnoreCase("Kost Putih")){
            computePaths(v6);
            for(Vertex v:vertices){
                System.out.println("Jarak ke  "+v+" adalah "+v.minDistance+ " Km dari  " +v6);
                List<Vertex> path = getShortestPathTo(v);
                System.out.println("Kost yang dilalui "+path);
                System.out.println("---------------------------------------------------");
                System.out.println("                                                    ");
        }
        
        }
        
        
    }
        
}

