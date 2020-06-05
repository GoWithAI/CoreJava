package string;

public class SubStringExample {

	public static void main(String[] args) {
		String s = "https://vishalvita.s3.ap-south-1.amazonaws.com/1590250863568-road-1072823_960_720.jpg?response-content-disposition=inline&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEL7%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCmFwLXNvdXRoLTEiRzBFAiEAwTyAapROmEc2RtNSoe0O6VZcNYYajPnzxw0ybanul58CIFNwuntaaDVOTw9XIrwSoSyP5iClj2HOuC95f9ULMp3aKvgBCCgQARoMODA2NTIzNDkwMzYxIgwQPpVRK0%2BQ3PpZiL0q1QFtzTp1dfKpGX2PbnBWcAVUZKtnCRUATYr7jPlOWlA1U7mEdES5pE0Udd3azx9%2FerNODVgEFrKa30dD%2FWX4x%2B9yoKOE3tLl%2BQPBmJ9%2BfP2ZzcvDfEnfDKHlP6uC3tIPCs3qddNm0beJsqA5pUNrea7iF9RFhPAHbgLfBQc9jr7LqR050Py8P1O12qcZI94DBd2cvi8C2zYIwNCJRd8TIBFY4KxQb5D8ePbfOHKeODlQit%2BMXdw24JpBcRb7m9nmomfcwwIkNq%2FqopV5YOvHap%2FBhuM%2Fqpww54jN9gU69gKmCq5aG0Is1liJJ21HHohOO7%2FA%2BeF63BW%2B97BEvwbdTPR7UAk3Gau7StQrKX3snDK7uXGEbpubiF%2BJBVJZuBiISifmt2SzY0FrsRJQ5KTHC0y0YnaTnAVD2IN8I%2BBR1y9lqE7%2BkdxUZg3E0Ct7OK27XTHto%2BrtuxjB%2F7J%2Bg9f8cLKxrpHy5wK4XIKmgcz4VfTafScrI1FG3%2FGe5GxkCFHcButesYkvEu1CaM9VyP5%2F35LL1vKcFr6%2BrhxUAC4vxP7kj0E3TrvLlMEO4W0XOB2Le9oUzn1W562aCudndGb4pwxwlxLqzNHGQf1o7zd9RQstm3%2By2VFr9HVdd2mWbqwOag3ybGKkdIxU7Sm61phiq%2FGWJQO3w71%2BWjxa7j9w6dhtuzNtjcr9uyvnwQiV3BZ89HuYY2daMqM8incILK%2FlcT6FlBbfU1g1Zs2f5FGcwstD4InRrvvjMGlngP3Z0X76Gqrm8TC7s0Cd%2FFauGCsb2fRIuuPi%2BQ%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20200531T062243Z&X-Amz-SignedHeaders=host&X-Amz-Expires=300&X-Amz-Credential=ASIA3XSEL2A4TBZ3VCW6%2F20200531%2Fap-south-1%2Fs3%2Faws4_request&X-Amz-Signature=964159d76a074677843c566478f60a2659d2c9beda905376cfda2cf9dc333ee4";
		String substring = s.substring(0, s.indexOf("?"));
		System.out.println(substring);
	}

}
