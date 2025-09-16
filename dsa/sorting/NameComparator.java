package dsa.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator{
	@Override
	public int compare(Object arg1,Object arg2) {
		return ((Emp)arg1).name.compareTo(((Emp)arg2).name);
	}
}
