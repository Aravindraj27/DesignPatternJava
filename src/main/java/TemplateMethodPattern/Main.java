package TemplateMethodPattern;

public class Main {

    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute();

        Task genReport = new GenerateReportTask();
        genReport.execute();
    }
}
