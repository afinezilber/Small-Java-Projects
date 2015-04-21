/* Allon Finezilber
   CSC-162
   Lab 1F */


public class TestScoreDemo
{
    public static void main(String[] args)
    {
		double[] badScores = {97.5, 66.7, 88.0, 101.0, 99.0};
		double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};

		TestScore scores1 = new TestScore(badScores);
		TestScore scores2 = new TestScore(goodScores);

		scores1.getAverage(badScores);
		scores2.getAverage(goodScores);

		System.out.println(scores2);
	}
}