package com.example.neokan.boletimescolar;

/***
 * Classe utilizada para objeto que represente um boletim escolar de um bimestre
 */
public class ReportCard {
    /** Número do Bimestre que o Boletim represente */
    private int mBimestre;

    /** Ano que o boletim representa */
    private int mAno;

    /** Nota para materia Portugues */
    private String mNotaPortugues;

    /** Nota para materia Matematica */
    private String mNotaMatematica;

    /** Nota para materia Historia */
    private String mNotaHistoria;

    /** Nota para materia Geografia */
    private String mNotaGeografia;

    /** Nota para materia Educacao Fisica */
    private String mNotaEducacaoFisica;

    /** Nota para materia Educacao Artistica */
    private String mNotaEducacaoArtistica;

    /***
     * Cria um novo objeto ReportCard
     *
     * Este construtor inicializa todas as notas como vazias (não informadas)
     */
    public ReportCard(int ano, int bimestre){
        mAno = ano;
        mBimestre = bimestre;
        mNotaEducacaoArtistica = "";
        mNotaEducacaoFisica = "";
        mNotaGeografia = "";
        mNotaHistoria = "";
        mNotaMatematica = "";
        mNotaPortugues = "";
    }

    /***
     * Cria um novo objeto ReportCard
     *
     * Este construtor inicializa as notas com os valores informados. Quando uma matéria não possuir nota, informar string vazia.
     *
     * @param bimestre número do bimestre que o boletim represente
     * @param notaEducacaoArtistica nota para matéria Educação Artística
     * @param notaEducacaoFisica nota para matéria Educação Física
     * @param notaGeografia nota para matéria Geografia
     * @param notaHistoria nota para matéria História
     * @param notaMatematica nota para matéria Matemática
     * @param notaPortugues nota para matéria Português
     */

    public ReportCard(int ano, int bimestre, String notaEducacaoArtistica, String notaEducacaoFisica, String notaGeografia, String notaHistoria, String notaMatematica, String notaPortugues){
        mAno = ano;
        mBimestre = bimestre;
        mNotaEducacaoArtistica = notaEducacaoArtistica;
        mNotaEducacaoFisica = notaEducacaoFisica;
        mNotaGeografia = notaGeografia;
        mNotaHistoria = notaHistoria;
        mNotaMatematica = notaMatematica;
        mNotaPortugues = notaPortugues;
    }

    /***
     * Retorna o Ano do bolteim
     * @return
     */
    public int getAno() {
        return mAno;
    }

    /***
     * Retorna o Bimestre do boletim
     * @return Bimestre
     */
    public int getBimestre() {
        return mBimestre;
    }

    /***
     * Retorna nota da matéria Educação Artística
     * @return String mNotaEducacaoArtistica
     */
    public String getNotaEducacaoArtistica() {
        return mNotaEducacaoArtistica;
    }

    /***
     * Retorna nota da matéria Educação Física
     * @return String mNotaEducacaoFisica
     */
    public String getNotaEducacaoFisica() {
        return mNotaEducacaoFisica;
    }

    /***
     * Retorna nota da matéria Geografia
     * @return String mNotaGeografia
     */
    public String getNotaGeografia() {
        return mNotaGeografia;
    }

    /***
     * Retorna nota da matéria História
     * @return String mNotaHistoria
     */
    public String getNotaHistoria() {
        return mNotaHistoria;
    }

    /***
     * Retorna nota da matéria Matemática
     * @return String mNotaMatematica
     */
    public String getNotaMatematica() {
        return mNotaMatematica;
    }

    /***
     * Retorna nota da matéria Português
     * @return String mNotaPortugues
     */
    public String getNotaPortugues() {
        return mNotaPortugues;
    }

    /***
     * Atribui o ano do boletim
     * @param mAno
     */
    public void setmAno(int mAno) {
        this.mAno = mAno;
    }

    /***
     * Atribui o bimestre do boletim
     * @param Bimestre
     */
    public void setmBimestre(int Bimestre) {
        this.mBimestre = mBimestre;
    }

    /***
     * Atribuí nota para matéria Educação Artística
     * @param mNotaEducacaoArtistica nota da matéria
     */
    public void setNotaEducacaoArtistica(String mNotaEducacaoArtistica) {
        this.mNotaEducacaoArtistica = mNotaEducacaoArtistica;
    }

    /***
     * Atribuí nota para matéria Educação Física
     * @param mNotaEducacaoFisica nota da matéria
     */
    public void setNotaEducacaoFisica(String mNotaEducacaoFisica) {
        this.mNotaEducacaoFisica = mNotaEducacaoFisica;
    }

    /***
     * Atribuí nota para matéria Geografia
     * @param mNotaGeografia nota da matéria
     */
    public void setNotaGeografia(String mNotaGeografia) {
        this.mNotaGeografia = mNotaGeografia;
    }

    /***
     * Atribuí nota para matéria História
     * @param mNotaHistoria nota da matéria
     */
    public void setNotaHistoria(String mNotaHistoria) {
        this.mNotaHistoria = mNotaHistoria;
    }

    /***
     * Atribuí nota para matéria Matemática
     * @param mNotaMatematica nota da matéria
     */
    public void setNotaMatematica(String mNotaMatematica) {
        this.mNotaMatematica = mNotaMatematica;
    }

    /***
     * Atribuí nota para matéria Português
     * @param mNotaPortugues nota da matéria
     */
    public void setNotaPortugues(String mNotaPortugues) {
        this.mNotaPortugues = mNotaPortugues;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mBimestre=" + mBimestre +
                ", mAno=" + mAno +
                ", mNotaPortugues='" + mNotaPortugues + '\'' +
                ", mNotaMatematica='" + mNotaMatematica + '\'' +
                ", mNotaHistoria='" + mNotaHistoria + '\'' +
                ", mNotaGeografia='" + mNotaGeografia + '\'' +
                ", mNotaEducacaoFisica='" + mNotaEducacaoFisica + '\'' +
                ", mNotaEducacaoArtistica='" + mNotaEducacaoArtistica + '\'' +
                '}';
    }
}
