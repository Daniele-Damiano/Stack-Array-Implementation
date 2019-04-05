package org.stackArrayImplementation;

import java.util.Arrays;

/**
 * Implementazione di uno Stack(Pila) mediante un array
 * 
 * @author Daniele Damiano
 *
 * @param <E>
 *            Una classe di un qualsiasi tipo
 */
public class Stack<E> {

	/* Capacità di Object[] iniziale */
	private static final int INITAL_CAPACITY = 6;
	/* cimaPila tiene traccia degli elemeti inseriti */
	private int cimaPila;
	/* Object[] array di oggetti il contenitore di elementi della pila */
	private Object[] pilaArray;

	/**
	 * Costruisce la classe stack ponendo cimaPila = 0, e pilaArray ad un valore
	 * iniziale INITIAL_CAPACITY
	 */
	public Stack() {
		this.cimaPila = 0;
		pilaArray = new Object[INITAL_CAPACITY];
	}

	/**
	 * Push inserisce un elemento in cima allo stack
	 * 
	 * @param e
	 *            Una casse di un qualsiasi tipo
	 */
	public void Push(E e) {
		VerificaRaddoppio();
		pilaArray[cimaPila] = e;
		cimaPila = cimaPila + 1;

	}

	/**
	 * 
	 * @return Restituisce ed elminina l'elemento dalla cima dello stack
	 */
	/*
	 * Nello stack ci sono solo istanze di E perchè il metodo Push(E e) inserisce
	 * nell'array Object[] solo istanze di E* Quindi la soppressione non dà problemi
	 */
	public E Pop() {
		if (!isEmpty()) {
			@SuppressWarnings("unchecked")
			E x = (E) pilaArray[cimaPila - 1]; /* Restituisce l'elemento dallo stack */
			pilaArray[cimaPila - 1] = null; /* elimina l'elemeto dalla posizione estratta */
			cimaPila = cimaPila - 1; /* Decrementa lo stack */
			VerificaDimezzamento();
			return x;
		}
		return null;
	}

	/**
	 * 
	 * @return Restitusce senza elmininare l'elemento dalla cima dello stack
	 */
	/*
	 * Nello stack ci sono solo istanze di E perchè il metodo Push(E e) inserisce
	 * nell'array Object[] solo istanze di E* Quindi la soppressione non dà problemi
	 */
	@SuppressWarnings("unchecked")
	public E Top() {

		if (!isEmpty()) {
			return (E) pilaArray[cimaPila - 1];
		}
		return null;

	}

	/**
	 * 
	 * @return Verifica se la pila è vuota
	 */
	public boolean isEmpty() {
		return (cimaPila == 0);

	}

	/**
	 * Se il numero di elmenti contenuti nello stack è uguale alla dimensione dello stack, raddoppia lo stack:
	 * if (cimaPila == pilaArray.length) raddoppia
	 */
	private void VerificaRaddoppio() {
		System.out.println("cimapila = " + cimaPila);
		System.out.println("pilaArray = " + pilaArray.length);
		if (cimaPila == pilaArray.length) {
			int size = pilaArray.length;
			size = size * 2;

			pilaArray = Arrays.copyOf(pilaArray, size);

			System.out.println("Verifica Raddoppio = " + pilaArray.length);
		}

	}
	/**
	 * Se il numero di elmenti contenuti nello stack è uguale alla dimensione dello stack diviso 4, dimezza lo stack:
	 * if (cimaPila == pilaArray.length/4) dimezza
	 */
	private void VerificaDimezzamento() {
		System.out.println("cimapila = " + cimaPila);
		System.out.println("pilaArray = " + pilaArray.length);
		if (cimaPila == pilaArray.length / 4) {
			int size = pilaArray.length;
			size = size / 2;

			pilaArray = Arrays.copyOf(pilaArray, size);

			System.out.println("Verifica Dimezzamento = " + pilaArray.length);

		}

	}

}
