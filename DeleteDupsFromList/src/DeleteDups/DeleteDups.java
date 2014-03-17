package DeleteDups;

import java.util.Scanner;


public class DeleteDups {
	public static void main(String[] args){
	int option;
	List l=new List();
	while(true){
		System.out.println("Enter your choice");
		System.out.println("1. Insert Begin"+"\n"+"2. Delete Dups");
		System.out.println("Enter 0 to exit");
		Scanner sc=new Scanner(System.in);
		option=sc.nextInt();
		switch(option){
		case 1: l.insertBegin();
		l.print();
		break;
		case 2: l.deleteDups();
		l.print();
		break;
		case 0:System.exit(0);
		}
	}
	}
}
class List{
	private class Node{
		int data;
		Node next;
	}
	Node head=null;
	public void print(){
		Node n=new Node();
		n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	
	public void insertBegin(){
		Node node=new Node();
		if(head==null){
			head=node;
			Scanner sc=new Scanner(System.in);
			head.data=sc.nextInt();
			head.next=null;
		}
		else{
			node.next=head;
			Scanner sc=new Scanner(System.in);
			node.data=sc.nextInt();
			head=node;
		}
	}
	public void deleteDups(){
		Node t1=head;
		Node t2=head.next;
		while(t2!=null){
			if(t1.data==t2.data){
				t1.next=null;
				t1.data=0;
				t1=t2;
				t2=t2.next;
			}
			else{
				t1=t1.next;
				t2=t2.next;
			}
		}
	}
}