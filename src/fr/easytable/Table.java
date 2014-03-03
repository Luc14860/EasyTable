package fr.easytable;

public class Table {
	
	public static Object[] add(Object[] table, Object value, int toId) {
		int i = toId;
		
		while(toId > i) {
			table[i + 1] = table[i];
			i++;
		}
		
		i = 0;
		
		table[toId] = value;
		
		return table;
	}
	
	public static Object[] remove(Object[] table, int id) {
		int i = id;
		
		table[i] = null;
		
		while(id > i) {
			table[i - 1] = table[i];
			i++;
		}
		
		i = 0;
		
		return table;
	}
	
	public static Object getValueAt(Object[] table, int id) {
		return table[id];
	}
	
	public static void setValueAt(Object[] table, Object value, int id) {
		table[id] = value;
	}
	
	public static int search(Object[] table, String keyword) {
		int i = 0;
		
		while(table.length > i) {
			if(table[i] == keyword) {
				return i;
			}
			
			i++;
		}
		
		i = 0;
		
		return -1;
	}
}
