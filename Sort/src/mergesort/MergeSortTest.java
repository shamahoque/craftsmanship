package mergesort;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;



public class MergeSortTest {
	@Test
	  public void SortEmptyList() {
	
	    Assert.assertTrue(Arrays.equals(new int[]{}, MergeSort.sort(new int[]{})));
	
	 }
	
	@Test
	 public void SortListWithOneElement() {
	
	   Assert.assertTrue(Arrays.equals(new int[]{1},MergeSort.sort(new int[]{1})));
	
	 }
	
	 @Test
	 public void SortListWithTwoElementsInCorrectOrder() {

	   Assert.assertTrue(Arrays.equals(new int[]{1, 2}, MergeSort.sort(new int[]{1, 2})));
	
	 }

	 @Test
	 public void SortListWithTwoElementsInReverseOrder() {

	   Assert.assertTrue(Arrays.equals(new int[]{1, 2}, MergeSort.sort(new int[]{2, 1})));

	 }

	 @Test
	 public void SortListWithSameTwoElements() {

	   Assert.assertTrue(Arrays.equals(new int[]{2, 2}, MergeSort.sort(new int[]{2, 2})));
	
	 }

	 @Test
	 public void SortListWithThreeElementsInCorrectOrder() {
	
	   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3},MergeSort.sort(new int[]{1, 2, 3})));
	
	 }

	 @Test
	 public void SortListWithThreeElementsFirstTwoSwapped() {
	
	   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3},MergeSort.sort(new int[]{2, 1, 3})));
	
	 }
	
	 @Test
	 public void SortListWithThreeElementslastTwoSwapped() {
	
	   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3},MergeSort.sort(new int[]{1, 3, 2})));
	
	 }
	
	 @Test
	 public void SortListWithThreeElementslReverseOrder() {
	
	   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3},MergeSort.sort(new int[]{3, 2, 1})));
	
	 }
	
	 @Test
	 public void SortListWithNElementaRandomOrder() {
	
	   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8},MergeSort.sort(new int[]{3, 2, 7, 6, 4, 8, 6, 1, 5})));
	
	 }

}
