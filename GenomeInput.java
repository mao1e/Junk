/*Design:
Variables
	instance variables in object class: (string) name, chemical formula ; (float) molar mass, density
	variables in driver class to be assigned values by Scanner: (string) name, chemical formula ; (float) molar mass, density
	
Input
	use scanner to take in the name, chemical formular, molarmass and density for each instance of the class in inputmthd()
	remind user if wrong data type is used do not accept any other datatypes for all variables
	
Processing
	driver to call input method .inputmthd for each instance of class
	inputmthd to declare variables (String) Name, ChemicalFormula (float) Molarmass, Density 
	inputmthd takes in input from user though Scanner and passes it as args in the format (String) Name, ChemicalFormula (float) Molarmass, Density to create new NucleicAcid object
	NucleicAcid constructor to take input in format (string a,b float c,d) and then using the respective input to call setters 
	setters to assign input values to instance variables for the class
	getters to return instance variable value when called upon during print
	
Output
	print method for each NucleicAcid class instance
	print method to use getters to obtain values to print in the format: (NAME) is (AGE) years old and lives in (address). Contact her at (mobiel number)
*/
import java.util.Scanner;

public class GenomeInput {
	static Scanner in = new Scanner(System.in);
	public static void main(String [] args)
	{
		GenomeInput n1 = new GenomeInput();
		HumanGenome Elsa = n1.inputmthd();
		HumanGenome Anna = n1.inputmthd();
		HumanGenome Olaf = n1.inputmthd();
		System.out.printf("____________________________________________________________________________\n");
		System.out.printf("  Genome name  NumberofGenes  NumberofChromosomes  NumberofCells (Trillions)\n");
		System.out.printf("----------------------------------------------------------------------------\n");
		Elsa.print();
		Anna.print();
		Olaf.print();
		System.out.printf("____________________________________________________________________________\n");
	}
	
	public HumanGenome inputmthd() {
    	String GenomeName = "";
    	int NumberofGenes = 0, NumberofChromosomes = 0, NumberofCellsInTrillions = 0;
    	System.out.printf("What is the Genome name?\n");
    	if (in.hasNextLine()) {
    		GenomeName = in.nextLine();
		}
		else {
			System.out.printf("Please rerun and enter a string value\n");
			System.exit(0);
		}
    	System.out.printf("What is the number of genes in %s?\n", GenomeName);
    	if (in.hasNextInt()) {
    		NumberofGenes = in.nextInt();
		}
		else {
			System.out.printf("Please rerun and enter an integer value\n");
			System.exit(0);
		}
    	System.out.printf("What is the number of Chromosomes in %s\n", GenomeName);
    	if (in.hasNextInt()) {
    		NumberofChromosomes = in.nextInt();
		}
		else {
			System.out.printf("Please rerun and enter an integer value\n");
			System.exit(0);
		}

    	System.out.printf("What is the number of cells in %s? The unit is trillion.\n", GenomeName);
    	if (in.hasNextInt()) {
    		NumberofCellsInTrillions = in.nextInt();
		}
		else {
			System.out.printf("Please rerun and enter a interger value\n");
			System.exit(0);
		}
    	in.nextLine();
    	System.out.printf("----------------------------------------------------------------------------\n");
		return new HumanGenome(GenomeName, NumberofGenes, NumberofChromosomes, NumberofCellsInTrillions);
	}
}

/* Positive Run 
What is the Genome name?
Human Bob
What is the number of genes in Human Bob?
20000
What is the number of Chromosomes in Human Bob
46
What is the number of cells in Human Bob? The unit is trillion.
76
----------------------------------------------------------------------------
What is the Genome name?
Human Sally
What is the number of genes in Human Sally?
20000
What is the number of Chromosomes in Human Sally
46
What is the number of cells in Human Sally? The unit is trillion.
120
----------------------------------------------------------------------------
What is the Genome name?
Human Sri
What is the number of genes in Human Sri?
20000
What is the number of Chromosomes in Human Sri
46
What is the number of cells in Human Sri? The unit is trillion.
75
----------------------------------------------------------------------------
____________________________________________________________________________
  Genome name  NumberofGenes  NumberofChromosomes  NumberofCells (Trillions)
----------------------------------------------------------------------------
    Human Bob       20000             46                 76
  Human Sally       20000             46                120
    Human Sri       20000             46                 75
____________________________________________________________________________

Negative Run
What is the Genome name?
Baddie
What is the number of genes in Baddie?
nonono
Please rerun and enter an integer value

*/
