class Numero{
    int n;

    Numero(int n){
        this.n = n;
    }

    int sommaM(int aggiunta){
        int somma = n + aggiunta;
        return somma;
    }

    void aggiungi(int aggiunta){
        n += aggiunta;
    }
}

