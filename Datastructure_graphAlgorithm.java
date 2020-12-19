
package datastructure_graphalgorithm;

import java.util.Scanner;
import jdk.internal.util.xml.impl.Input;

public class Datastructure_graphAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
		System.out.println("==================================================\n"
		+"             * Algoithm *             \n"
		+"==================================================\n"
		+"	1. Data Structure\n"
		+"	2. Graph Algorithm\n");
		System.out.println();
		System.out.print("Type your choice >: ");
		int choice = input.nextInt();
		if(choice == 1) {
                    dataStructure();
		}
		else {
                    graphAlgorithm();
		}

	}
    }
    public static void dataStructure(){
        DataStructure dt = new DataStructure();
        Input in = new Input();
        Scanner input = new Scanner(System.in);
	System.out.println("==================================================\n"
            +"* Data Structure *       \n"
            +"==================================================\n"
            +"    1. Linear Search\n"
            +"    2. Binary Search\n"
            +"    3. Bubble Sort\n"
            +"    4. Insertion Sort\n"
            +"    5. Selection Sort\n"
            +"    6. Quick Sort\n"
            +"    7. Merge Sort\n"
            +"   8. Stack\n");
            System.out.println();
            System.out.print("Enter your Data Structure choice >: ");
            int n1 = input.nextInt();
            switch(n1) {
            case 1:
                dt.linearSearch();
                break;
            case 2:
                dt.binarySearch();
                break;
            case 3:
                dt.bubbleShort();
                break;
            case 4:
                dt.insertionShort();
                break;
            case 5:
                dt.selectionSort();
                break;
            case 6:
                dt.quickSort();
                break;
            case 7:
                dt.mergeShort();
                break;
            case 8:
                dt.stkPushPopDispaly();
                break;
            default:
                System.out.println("Sorry you enter invalide keyword.");
                break;
	}
		
    }
    public static void graphAlgorithm(){
        GraphAlgorithm gh = new GraphAlgorithm(4);
        TopologicalShort ght = new TopologicalShort(6); 
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------\n"
        +"* Graph Algorithm *\n"
        +"--------------------------------------\n"
        +"    1.  BFS\n"
        +"    2.  DFS\n"
        +"    3.  Topological Sort\n"
        +"    4.  Krushkal\n"
        +"    5.  Prim's\n"
        +"    6.  Dijkastra\n"
        +"    7.  Bellman-Ford\n"
        +"    8.  Floyed-Warshall\n");
        System.out.println();	
        System.out.print("Type your Graph Algorithm choice >: ");
        int n2 = input.nextInt();
        switch(n2) {
            case 1:
                gh.addEdge(0, 1);
                gh.addEdge(0, 2);
                gh.addEdge(1, 2);
                gh.addEdge(2, 0);
                gh.addEdge(2, 3);
                gh.addEdge(3, 3);
                gh.BFS(2);
                break; 
            case 2:
                gh.addEdge(0, 1);
                gh.addEdge(0, 2);
                gh.addEdge(1, 2);
                gh.addEdge(2, 3);
                System.out.println("Start here DFS code");
                gh.DFS(2);
                break;
            case 3:
                ght.addEdge(5, 2); 
                ght.addEdge(5, 0); 
                ght.addEdge(4, 0); 
                ght.addEdge(4, 1); 
                ght.addEdge(2, 3); 
                ght.addEdge(3, 1); 
                System.out.println("Following is a Topological " + 
                                   "sort of the given graph"); 
                ght.topologicalSort(); 
                break;
            case 4:
                    break;
            case 5:
                    break;
            case 6:
                    break;
            case 7:
                    break;
            case 8:
                    break;
            case 9:
                    break;
            default:
                    break;
        }
    }
}
