class Numero{
    int n;

    Numero(int n){
        this.n = n;
    }

    int sommaM(int aggiunta){
        int somma = this.n + aggiunta;
        return somma;
    }

    void aggiungi(int aggiunta){
        this.n += aggiunta;
    }
}

