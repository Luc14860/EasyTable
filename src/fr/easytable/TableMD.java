package fr.easytable;

public class TableMD {
	
	public static Object[] add(Object[][] table, Object value, int row, int toId) {
		int i = toId;
		
		while(toId > i) {
			table[row][i + 1] = table[i];
			i++;
		}
		
		i = 0;
		
		table[row][toId] = value;
		
		return table;
	}
	
	public static Object[] addRow(Object[][] table, Object[] value, int row) {
		int i = row;
		
		while(row > i) {
			table[row] = value;
			i++;
		}
		
		i = 0;
		
		table[row] = value;
		
		return table;
	}
	
	public static Object[] remove(Object[][] table, int row, int id) {
		int i = id;
		
		while(id > i) {
			table[row][i - 1] = table[row][i];
			i++;
		}
		
		i = 0;
		
		table[row][i] = null;
		
		return table;
	}
	
	public static Object[] removeRow(Object[][] table, int row) {
		int i = row;
		
		while(row > i) {
			table[i - 1] = table[i];
			i++;
		}
		
		i = 0;
		
		table[row][i] = null;
		
		return table;
	}
	
	public static Object getValueAt(Object[][] table, int row, int id) {
		return table[row][id];
	}
	
	public static Object getRowAt(Object[][] table, int row) {
		return table[row];
	}
	
	public static void setValueAt(Object[][] table, Object value, int row, int id) {
		table[row][id] = value;
	}
	
	public static void setRowAt(Object[][] table, Object[] value, int row) {
		table[row] = value;
	}
	
	public static int search(Object[][] table, int row, String keyword) {
		int i = 0;
		
		while(table.length > i) {
			if(table[row][i] == keyword) {
				return i;
			}
			
			i++;
		}
		
		i = 0;
		
		return -1;
	}
	
	/*
	
	public static int[] searchMultiRow(Object[][] table, String keyword) {
		int i = 0;
		int j = 0;
		
		while(table.length > i) {
			while(table[i].length > j) {
				if(table[i][j] == keyword) {
					return new int[] = {i, j};
				}
				
				j++;
			}
			
			i++;
		}
		
		i = 0;
		j = 0;
		
		return -1;
	}
	
	*/
}
