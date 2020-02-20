package fr.tzoreol.votewatcher.domain;

public class VotingResults {

    private String content;

    public VotingResults(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}