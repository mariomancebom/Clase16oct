package es.upm.dit.aled.clase16oct;

import java.util.Arrays;

public class MargeSort {

	private static int[] margeSort(int[] list) {
		// caso base
		if (list.length == 1) {
			return list;
		}
		// Paso recursivo
		int[] left = Arrays.copyOfRange(list, 0, list.length / 2);
		int[] right = Arrays.copyOfRange(list, list.length / 2, list.length);
		// Ordeno la mitad izquierda
		int[] sortedLeft = margeSort(left);
		// Ordeno la mitad derecha
		int[] sortedRight = margeSort(right);
		// Creo el array en el que pondre las cosas ordenadas
		int[] sortedMarged = new int[list.length];
		int iMerged = 0, iLeft = 0, iRight = 0;
		while (iLeft < sortedLeft.length || iRight < sortedRight.length) {
			if (sortedLeft[iLeft] <= sortedRight[iLeft]) {
				// Cojo del array izquierdo
			}
		}
		return null;
	}
}