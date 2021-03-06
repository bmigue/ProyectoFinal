package abstractFactory.concrete_Product;


import abstractFactory.abstract_Product.Dice;

public class DiceInfantry implements Dice {
    private int diceCode;
    private String diceType;

    @Override
    public String getType() {
        return this.diceType;
    }

    @Override
    public int generateDiceCode() {
        return (int) (Math.random() * 9999);
    }

    @Override
    public String generateDiceType() {
        return "DadoInfanteria";
    }

    @Override
    public int getCode() {
        return diceCode;
    }

    public void setDiceCode(int code) {
        this.diceCode = 10000 + code;
    }


    public void setDiceType(String type) {
        this.diceType = type;
    }
}
