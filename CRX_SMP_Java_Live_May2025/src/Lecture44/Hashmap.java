package Lecture44;

import java.util.ArrayList;

public class Hashmap<K,V> {
	//All methods in O(1)
	public class Node{
		K key;
		V value;
		Node next;
	}
	private ArrayList<Node> bckt;
	private int size =0;//No of nodes
	public Hashmap() {
		bckt =  new ArrayList<>();
		for (int i = 0; i <5; i++) {
			bckt.add(null);
		}
	}
	
	public void put(K key, V val) {
		int idx = hashfunc(key);
		Node head  = bckt.get(idx);
		Node temp = head;
		//case ==> check if key present
		while(temp!=null) {
			if(temp.key.equals(key)) {// key already present ==> update value
				temp.value = val;
				return;
			}
			temp = temp.next;
		}
		//Case 2 ==> k not present
		Node nn  = new Node();
		nn.key = key;
		nn.value =val;
		nn.next = head;
		
		bckt.set(idx, nn);
		this.size++;
		
		double thf = 2.0;
		double lf = this.size/ this.bckt.size();
		
		if(lf>thf) {
			rehashing();
		}
		
	}
	
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> temp = new ArrayList<>();
		
		for (int i = 0; i < 2* bckt.size(); i++) {
			temp.add(null);
		}
		ArrayList<Node> rv = bckt;
		this.bckt = temp;
		
		for (Node node : rv) {
			while(node!=null) {
				put(node.key,node.value);
				node = node.next;
			}
		}
		
	}

	public V remove(K key){
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		Node prev =null;
		
		while(curr!=null) {// searching
			if(curr.key.equals(key)) {//key found
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if(curr == null) {//node not found
			return null;
		}
		if(prev == null) {// remove head
			this.bckt.set(idx, curr.next);
		}
		else {
			prev.next = curr.next;
			curr.next = null;
		}
		this.size--;
		return curr.value;	
	}
	
	@Override
	public String toString() {
		String s = "{";
		
		for (Node node : bckt) {
			while(node!=null) {
				s+= node.key + "==>" +node.value+ ",";
				node = node.next;
			}
		}
		s+="}";
		return s;
	}
	public V get(K key) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		
		while(curr!=null) {// searching
			if(curr.key.equals(key)) {//key found
				return curr.value;
			}
			curr = curr.next;
		}
		return null;
	}
	
	public boolean containsKey(K key) {
		int idx = hashfunc(key);
		Node curr = bckt.get(idx);
		
		while(curr!=null) {// searching
			if(curr.key.equals(key)) {//key found
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	private int hashfunc(K key) {
		// TODO Auto-generated method stub
		int hc = key.hashCode();
		int idx = hc % this.bckt.size();
		
		return Math.abs(idx);
	}
	
}
