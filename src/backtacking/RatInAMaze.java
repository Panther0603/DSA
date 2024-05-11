package backtacking;

import java.util.ArrayList;

public class RatInAMaze {


    public  static void printRatInAMaze(int maze[][],int n){
        printRatInAMaze(maze,0,0,"",new boolean[n][n]);
    }


    public  static void printRatInAMaze(int maze[][],int col,int row,String path,boolean isVisited[][]){

        if( row< 0  || col <0 || row >= maze.length || col >= maze[0].length || maze[row][col]==0 || isVisited[row][col]){
            return;
        }
        if(row == maze.length-1 &&  col == maze[0].length-1){
            System.out.println(path);
            return;
        }

        isVisited[row][col]=true;
        printRatInAMaze(maze,row+1,col,path+"D",isVisited);
        printRatInAMaze(maze,row-1,col,path+"U",isVisited);
        printRatInAMaze(maze,row,col+1,path+"R",isVisited);
        printRatInAMaze(maze,row,col-1,path+"L",isVisited);
        isVisited[row][col]=false;

    }

    public static ArrayList<String> findPath(int row,int col,int [][]maze,int n,String path,boolean [][]isVisited,ArrayList<String> pathlist){
        if(row<0 || col<0 || row>= n || col >= n || maze[row][col]==0 || isVisited[row][col]){
            return pathlist;
        }

       if(row == n-1 && col ==n-1){
           pathlist.add(path);
           return  pathlist;
       }

       isVisited[row][col]=true;
       findPath(row+1,col,maze,n,path+"D",isVisited,pathlist);
       findPath(row-1,col,maze,n,path+"D",isVisited,pathlist);
       findPath(row,col+1,maze,n,path+"R",isVisited,pathlist);
       findPath(row,col-1,maze,n,path+"L",isVisited,pathlist);
       isVisited[row][col]=false;

       return pathlist;
    }


    public static ArrayList<String> getAllMazePath(int row,int col,int [][] maze,String path,boolean [][] isVisted,ArrayList<String> allPath){

        if(row <0 || col<0 || row >= maze.length || col >= maze[0].length || maze[row][col] == 0 || isVisted[row][col]){
            return  allPath;
        }
        if(row == maze.length-1 && col == maze[0].length-1){
            allPath.add(path);
            return  allPath;
        }
        isVisted[row][col]=true;
        allPath=getAllMazePath(row+1,col,maze,path+"D",isVisted,allPath);
        allPath=getAllMazePath(row-1,col,maze,path+"U",isVisted,allPath);
        allPath=getAllMazePath(row,col+1,maze,path+"R",isVisted,allPath);
        allPath=getAllMazePath(row,col-1,maze,path+"L",isVisted,allPath);

        isVisted[row][col]=false;
        return allPath;
    }

//    public static  ArrayList<String>
    public static void main(String[] args) {

        int m[][] = {{1, 0, 0, 0},
                     {1, 1, 0, 1},
                     {1, 1, 0, 0},
                     {0, 1, 1, 1}};
        int n=4;

        printRatInAMaze(m,n);

        ArrayList<String> arrayList=findPath(0,0,m,n,"",new boolean[n][n],new ArrayList<>());
        System.out.println(arrayList.size());
    }
}
