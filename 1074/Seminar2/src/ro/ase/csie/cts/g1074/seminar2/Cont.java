package ro.ase.csie.cts.g1074.seminar2;

import ro.ase.csie.cts.g1074.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1074.seminar2.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	public abstract void retrage(double suma) throws ExceptieFonduriInsuficiente;
	public abstract void depune(double suma);
	public abstract void transfer(
			double suma, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
	public abstract double getBalanta();
}
