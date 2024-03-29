package com.example.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.agenda.modelo.Aluno;

public class FormularioHelper {
    private final EditText campoNome;
    private final EditText campoEndereco;

    private final EditText campoSite;
    private final RatingBar campoNota;


    public FormularioHelper(FormularioActivity activity)  {
        // Faz as referencias no xml, usando o findViewById
        campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
    }


    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());

        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;
    }
}
