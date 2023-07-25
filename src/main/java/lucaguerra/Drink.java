package lucaguerra;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Drink extends AbstractProdotti {

	private String valoreNutrizionale;

	public Drink(String nome, double prezzo, String valoreNutrizionale) {
		super(nome, prezzo);
		this.valoreNutrizionale = valoreNutrizionale;
	}

	@Override
	public String toString() {
		return "Drink :" + " " + getNome() + " " + getPrezzo() + " " + valoreNutrizionale + "]";
	}

}