public class MyLinkedList{

private Node head;
private Node tail;
private int count;

public void addFirst(int item){
Node temp = new Node(item,head);
if(isEmpty())
   tail = head = temp;
  head = temp;
count++;
}
public int getFirstItem(){
 int item = 0;
 if(!isEmpty())
 item = head.getItem();
return item;
} 
public int getLastItem(){
 int item = 0;
 if(!isEmpty())
   item = tail.getItem();
  return item; 
}
public boolean isEmpty(){
  return head == null;
}
//removing the first element
public void removeFirst(){
if(!isEmpty())
   {
   Node temp = head; // let temp point to the head
    head = head.getLink(); //move your head to the next Node
    
    temp.setLink(null); //removing the first node from the linkedlist
    
    count--;
}

if(head == null) tail = null;
}
//adding last element
public void addLast(int item){
Node temp = new Node(item);
if(isEmpty())
  addFirst(item);
tail.setLink(temp);
tail=temp;
count++;
}
// removing the last element
public void removeLast(){
Node temp = head;
Node tail=null;
while(temp.getLink().getLink()!=null){
tail=temp;
temp=temp.getLink();
}
temp.setLink(null);
count--;
}
//finding the index count starts with 1
public int getPos(int item){
int count = 1;
if(!isEmpty()){
   Node head=this.head;
   if(head.getItem()==item){
   return count;
   }
   count++;
   head=head.getLink(); 
}
return -1;
}
// searching an element
public boolean isFound(int item){
return getPos(item)>=0;
}
//sum
public int getSum(){ 
    Node temp = head; 
    int sum = 0; 
    while (temp != null)  
    { 
        sum=sum+temp.getItem();
        temp=temp.getLink();
    } 
     
    return sum;
 }
 
 //displaying even numbers
 public void displayeven(){
 Node temp=this.head;
 Node tail=null;
 while(temp!=null){
   if(temp.getItem()%2==0)
   tail=temp;
   temp=temp.getLink().getLink();
   System.out.println(tail);
   }
 }
 //displaying the smallest number
 public int getSmallest(){
 int smallest= head.getItem();
 Node temp=this.head;
 while(temp!=null){
 if(smallest>temp.getItem())
   smallest=temp.getItem();
   temp=temp.getLink();
   }
   return smallest;
   }
   
   //displaying largest
   public int getLargest(){
   int largest=head.getItem();
   Node temp=this.head;
   while(temp!=null){
   if(largest<head.getItem())
      largest=temp.getItem();
      temp=temp.getLink();
      }
      return largest;
      }
      
 
 //removing at specific index
 public void removeAt(int pos){
 if(this.count==1)
 this.head=this.tail=null;
 else if(pos==1)
 this.head=head.getLink();
 else{
   Node head=this.head;
   int count=1;
   while(count!=pos-1){
   head=head.getLink();
   count++;
   }
   head.setLink(head.getLink());
   }
   this.count--;
   }
   //removing nodes with the given item
   public void remove(int item){
   Node head= this.head;
   int count=1;
   
   while(head!=null){
   if(head.getItem()==item)
   removeAt(count);
   head=head.getLink();
   count++;
   }
 }
 
 //inserting in given position
 public void insertAt(int pos, int item){
   Node temp=new Node (item);
   Node head=this.head;
   int count=1;
   while(count!=pos-1){
      head=head.getLink();
      count++;
      }
    temp.setLink(head.getLink());
      head.setLink(temp);
      this.count++;
      }
      public int getCount()
      {
      return count;
         }
         

 
public String toString(){
StringBuffer sb = new StringBuffer();
sb.append("{");
Node p = head;
while(p!=null){
   sb.append(p.getItem() + " ");
   p = p.getLink();
   }
sb.append("}");
return sb.toString();
}
//for testing
public static void main(String[] args){
MyLinkedList list = new MyLinkedList();
list.addFirst(4);
list.addFirst(3);
list.addFirst(2);
list.addFirst(1);
list.addFirst(0);
list.addLast(5);
list.addLast(6);
list.addLast(7);
System.out.println("List Contains : " + list);
System.out.println("Removing 0");
list.remove(0);
//System.out.println("Removing 
System.out.println("Sum is  "+list.getSum());
System.out.println("is 0 found ?:" +list.isFound(0));
System.out.println("What is the index of 0 ?:" +list.getPos(0));
list.removeFirst();
System.out.println("List Contains : " + list);
list.removeFirst();
System.out.println("List Contains : " + list);
list.removeFirst();
System.out.println("List Contains : " + list);
list.removeLast();
System.out.println("List Contains : " + list);
list.removeLast();
System.out.println("List Contains : " + list);
System.out.println("The first element is : " + list.getFirstItem());
System.out.println("The Last element is : " + list.getLastItem());
//System.out.println("Insert item : " +list.insertAt(3,20));
}
}

/*public void addFront(int item){}===done
public void addLast(int item){}===done
public void insertAtOrderedList(int item){}
public void removeFront(int item){}==done
public void removeLast(){}
public void remove(int item){}
public void displayAllEven(){}
public int getSmallest(){}
public int getLargest(){}
public int getSum(){}
*/