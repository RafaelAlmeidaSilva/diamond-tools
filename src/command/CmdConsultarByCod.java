package command;

import dominio.EntidadeDominio;
import util.Resultado;

public class CmdConsultarByCod extends AbstractCommand{

	@Override
	public Resultado executar(EntidadeDominio entidade) {
		return fachada.consultarByCod(entidade);
	}

}
