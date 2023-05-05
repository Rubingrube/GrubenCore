package de.rubingrube.GrubenCore.Settings;

public class Main {
    public RankUpData rankData;
    public DeathPenaltyData deathPenaltyData;
    public BlockTreasureData blockTreasureData;

    public Main(){
        rankData = new RankUpData();
        deathPenaltyData = new DeathPenaltyData();
        blockTreasureData = new BlockTreasureData();
    }
}