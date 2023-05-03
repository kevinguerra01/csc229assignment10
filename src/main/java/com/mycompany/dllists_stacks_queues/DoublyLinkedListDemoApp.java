
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author Kevin Guerra 
 */
public class DoublyLinkedListDemoApp {
   public static void main(String[] args) {
      DoublyLinkedList numList = new DoublyLinkedList();
      Node nodeA = new Node(14);
      Node nodeB = new Node(2);
      Node nodeC = new Node(20);
      Node nodeD = new Node(31);
      Node nodeE = new Node(16);
      Node nodeF = new Node(55);

      numList.append(nodeA);   // Add 14
      numList.append(nodeB);   // Add 2, make the tail
      numList.append(nodeC);   // Add 20, make the tail

      numList.prepend(nodeD);  // Add 31, make the head

      numList.insertAfter(nodeB, nodeE);  // Insert 16 after 2
      numList.insertAfter(nodeC, nodeF);  // Insert 55 after tail, 55 becomes new tail

      // Output list
      System.out.print("List after adding nodes: ");
      numList.printList();

      // Remove the tail node, then the head node
      numList.remove(nodeF);
      numList.remove(nodeD);
      
      System.out.println("List:");
        numList.printList();

        // convert the list to an array and print it
        System.out.println("Array:");
        int[] arr = numList.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // find the index of the first occurrence of 3 in the list
        int index = numList.indexOf(new Node(3));
        System.out.println("Index of 3: " + index);

        // find the sum of the last 3 elements in the list
        int sum = numList.sumLastMElements(3);
        System.out.println("Sum of last 3 elements: " + sum);
      
      
      
   }
}
