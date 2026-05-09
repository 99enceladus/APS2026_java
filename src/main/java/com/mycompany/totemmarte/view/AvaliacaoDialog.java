package com.mycompany.totemmarte.view;

import com.mycompany.totemmarte.controller.SessaoController;
import com.mycompany.totemmarte.modelo.SessaoModelo;
import java.awt.Frame;
import java.util.List;

public class AvaliacaoDialog extends FormDialog {

    public AvaliacaoDialog(Frame parent, SessaoController controller, List<SessaoModelo> sessoes) {
        super(parent, controller, sessoes);
    }
}
