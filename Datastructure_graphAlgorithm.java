
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
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------\n"
        +"* Graph Algorithm *\n"
        +"--------------------------------------\n"
        +"    1.  Graph Representaion\n"
        +"    2.  BFS\n"
        +"    3.  DFS\n"
        +"    4.  Topological Sort\n"
        +"    5.  Krushkal\n"
        +"    6.  Prim's\n"
        +"    7.  Dijkastra\n"
        +"    8.  Bellman-Ford\n"
        +"    9.  Floyed-Warshall\n");
        System.out.println();	
        System.out.print("Type your Graph Algorithm choice >: ");
        int n2 = input.nextInt();
        switch(n2) {
            case 1:
                    break;
            case 2:
                gh.addEdge(0, 1);
                gh.addEdge(0, 2);
                gh.addEdge(1, 2);
                gh.addEdge(2, 0);
                gh.addEdge(2, 3);
                gh.addEdge(3, 3);
                gh.BFS(2);
                break;
            case 3:
                gh.addEdge(0, 1);
                gh.addEdge(0, 2);
                gh.addEdge(1, 2);
                gh.addEdge(2, 3);
                System.out.println("Start here DFS code");
                gh.DFS(2);
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
