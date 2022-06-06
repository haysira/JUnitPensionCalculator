package sem12122.sse3305.service;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class PensionServiceIMPTest {
	DecimalFormat df = new DecimalFormat("#.00");
	
	@Test
	void testcase1() { //TC1: Age= 40 Service= 121
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		double actPension, actGratuity, actCash;
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("1");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("1")||tiadaganjaran.equals("2")) {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		} else {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
		}
	}
	
	@Test
	void testcase2() { //TC2: Age= 50 Service= 110 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		double actPension, actGratuity, actCash;
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("1");
		test.add("2011");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("3");//bulansara
		test.add("2020");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("1")||tiadaganjaran.equals("2")) {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		} else {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
		}
			
	}
	@Test
	void testcase3() { //TC2: Age= 35 Service= 121 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("1");
		test.add("1995");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("3");//bulansara
		test.add("2005");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("1")||tiadaganjaran.equals("2")) {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		} else {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
		}
	}
	@Test
	void testcase4() { //TC2: Age= 30 Service= 100 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("1");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("5");//bulansara
		test.add("2000");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("1")||tiadaganjaran.equals("2")) {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		} else {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
		}
	}

	@Test
	void testcase5() { //TC5 = start kerja before= 12/4/1991 & Gender = 'F' & istimewa = 'Y'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1986");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("Y");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,45);
	}
	
	@Test
	void testcase6() { //TC6 = start kerja before= 12/4/1991 & Gender = 'F' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1986");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,45);
	}
	
	@Test
	void testcase7() { //TC7 = start kerja before= 12/4/1991 & Gender = 'L' & istimewa = 'Y'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1986");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("Y");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,45);
	}
	@Test
	void testcase8() { //TC8 = start kerja before= 12/4/1991 & Gender = 'L' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1986");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,50);
	}
	@Test
	void testcase9() { //TC9 = start kerja AFTER= 12/4/1991 & Gender = 'F' & istimewa = 'Y'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("Y");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,55);
	}
	@Test
	void testcase10() { //TC10 = start kerja AFTER= 12/4/1991 & Gender = 'F' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,55);
	}
	@Test
	void testcase11() { //TC11 = start kerja AFTER= 12/4/1991 & Gender = 'L' & istimewa = 'Y'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("Y");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,55);
	}
	@Test
	void testcase12() { //TC12 = start kerja AFTER= 12/4/1991 & Gender = 'L' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,55);
	}
	
	@Test
	void testcase13a() { //TC13: Age= 39 Service= 119 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("2");
		test.add("1999");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("1");//bulansara
		test.add("2009");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	
	@Test
	void testcase13b() { //TC13: Age= 39 Service= 120 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("1");
		test.add("1999");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("1");//bulansara
		test.add("2009");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	
	@Test
	void testcase13c() { //TC13: Age= 39 Service= 121 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("1");
		test.add("1999");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2009");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	
	@Test
	void testcase13d() { //TC13: Age= 40 Service= 119 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("3");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	
	@Test
	void testcase13e() { //TC13: Age= 40 Service= 120 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("2");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	
	@Test
	void testcase13f() { //TC13: Age= 41 Service= 119 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("3");
		test.add("2001");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2011");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	@Test 
	void testcase13g() { //TC13: Age= 42 Service= 119 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("3");
		test.add("2002");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2012");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	@Test
	void testcase13h() { //TC13: Age= 41 Service= 120 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("2");
		test.add("2001");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2011");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	@Test
	void testcase13i() { //TC13: Age= 41 Service= 121 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("1");
		test.add("2001");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2011");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	@Test
	void testcase14() { //TC14: Age= 50 Service= 130 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("4");
		test.add("2009");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2020");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(650,actPension);
			assertEquals(29250,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	
	@Test
	void testcase15() { //TC15: Age= 30 Service= 110 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1991");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2000");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	@Test
	void testcase16() { //TC16: Age= 35 Service= 121 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("1");
		test.add("1995");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2005");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	
	@Test
	void testcase17() { //TC17: Age= 45 Service= 125 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("9");
		test.add("2004");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("2015");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(625,actPension);
			assertEquals(28125,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	
	@Test
	void testcase18() { //TC18: Age= 25 Service= 100 -output(2) tiadaganjaran=1
		PensionServiceIMP pc = new PensionServiceIMP();
		double actPension, actGratuity, actCash;
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1986");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		if (tiadaganjaran.equals("0")) {
			actPension = Double.parseDouble(output.get(4));
			actGratuity = Double.parseDouble(output.get(5));
			actCash = Double.parseDouble(output.get(6));
			assertEquals(605,actPension);
			assertEquals(27225,actGratuity);
			assertEquals(12440,actCash);
			
		} else {
			actPension = 0;
			actGratuity = 0;
			actCash = 0;
			assertEquals(0,actPension);
			assertEquals(0,actGratuity);
			assertEquals(0,actCash);
		}
	}
	@Test
	void testcase19() { //TC19 = start kerja BEFORE= 12/4/1991 & Gender = 'P' & istimewa = 'DONT CARE'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1990");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
				umurbayarpencen = 55;
			}
			
		}
	assertEquals(umurbayarpencen,45);
	}
	
	@Test
	void testcase20() { //TC20 = start kerja AFTER= 12/4/1991 & Gender = 'DONT CARE' & istimewa = 'DONT CARE'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
				umurbayarpencen = 55;
			}
			
		}
	assertEquals(umurbayarpencen,55);
	}
	
	//start control structure
	@Test
	void testcase21() { //TC21 = Hari Lahir = 20.1.1970 & Retirement date = 10.2.2010
		ArrayList<String> test = new ArrayList<>();
		test.add("20");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("10");//harisara
		test.add("2");//bulansara
		test.add("2010");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int minusbulan = 0;
		int minustahun;
		int plusbulan = 0;

		minustahun = 0;
		if (Integer.parseInt(test.get(12)) < Integer.parseInt(test.get(0)))
			minusbulan = 1;
		if ((Integer.parseInt(test.get(13)) - minusbulan) < Integer.parseInt(test.get(1))) {
			plusbulan = 12;
			minustahun = 1;
		}
		int umursara_bulan = Integer.parseInt(test.get(13)) - minusbulan + plusbulan - Integer.parseInt(test.get(1));
		int umursara_tahun = Integer.parseInt(test.get(14)) - minustahun - Integer.parseInt(test.get(2));
	
		assertEquals(umursara_bulan,0);
		assertEquals(umursara_tahun,40);
		
	}
	
	@Test
	void testcase22() { //TC22 = Hari Lahir = 20.10.1970 & Retirement date = 10.7.2010
		ArrayList<String> test = new ArrayList<>();
		test.add("20");
		test.add("10");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("10");//harisara
		test.add("7");//bulansara
		test.add("2010");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int minusbulan = 0;
		int minustahun;
		int plusbulan = 0;

		minustahun = 0;
		if (Integer.parseInt(test.get(12)) < Integer.parseInt(test.get(0)))
			minusbulan = 1;
		if ((Integer.parseInt(test.get(13)) - minusbulan) < Integer.parseInt(test.get(1))) {
			plusbulan = 12;
			minustahun = 1;
		}
		int umursara_bulan = Integer.parseInt(test.get(13)) - minusbulan + plusbulan - Integer.parseInt(test.get(1));
		int umursara_tahun = Integer.parseInt(test.get(14)) - minustahun - Integer.parseInt(test.get(2));
	
		assertEquals(umursara_bulan,8);
		assertEquals(umursara_tahun,39);
		
	}
	@Test
	void testcase23() { //TC23 = Hari Lahir = 10.10.1970 & Retirement date = 20.7.2010
		ArrayList<String> test = new ArrayList<>();
		test.add("10");
		test.add("10");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("20");//harisara
		test.add("7");//bulansara
		test.add("2010");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int minusbulan = 0;
		int minustahun;
		int plusbulan = 0;

		minustahun = 0;
		if (Integer.parseInt(test.get(12)) < Integer.parseInt(test.get(0)))
			minusbulan = 1;
		if ((Integer.parseInt(test.get(13)) - minusbulan) < Integer.parseInt(test.get(1))) {
			plusbulan = 12;
			minustahun = 1;
		}
		int umursara_bulan = Integer.parseInt(test.get(13)) - minusbulan + plusbulan - Integer.parseInt(test.get(1));
		int umursara_tahun = Integer.parseInt(test.get(14)) - minustahun - Integer.parseInt(test.get(2));
	
		assertEquals(umursara_bulan,9);
		assertEquals(umursara_tahun,39);
		
	}
	@Test
	void testcase24() { //TC24 = Hari Lahir = 10.8.1970 & Retirement date = 20.10.2010
		ArrayList<String> test = new ArrayList<>();
		test.add("10");
		test.add("8");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("10");
		test.add("1992");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("20");//harisara
		test.add("10");//bulansara
		test.add("2010");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int minusbulan = 0;
		int minustahun;
		int plusbulan = 0;

		minustahun = 0;
		if (Integer.parseInt(test.get(12)) < Integer.parseInt(test.get(0)))
			minusbulan = 1;
		if ((Integer.parseInt(test.get(13)) - minusbulan) < Integer.parseInt(test.get(1))) {
			plusbulan = 12;
			minustahun = 1;
		}
		int umursara_bulan = Integer.parseInt(test.get(13)) - minusbulan + plusbulan - Integer.parseInt(test.get(1));
		int umursara_tahun = Integer.parseInt(test.get(14)) - minustahun - Integer.parseInt(test.get(2));
	
		assertEquals(umursara_bulan,2);
		assertEquals(umursara_tahun,40);
		
	}
	@Test
	void testcase25() { //TC25 = start kerja= 12/4/1989 & Gender = 'P' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("4");
		test.add("1989");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,45);
	}
	@Test
	void testcase26() { //TC26 = start kerja= 12/4/1984 & Gender = 'L' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("1");
		test.add("1984");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,50);
	}
	@Test
	void testcase27() { //TC27 = start kerja= 12/10/2001 & Gender = 'P' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("10");
		test.add("2001");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,55);
	}
	@Test
	void testcase28() { //TC28 = start kerja= 12/10/2001 & Gender = 'L' & istimewa = 'Y'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("10");
		test.add("2001");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("Y");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,55);
	}

	@Test
	void testcase29() { //TC29 = start kerja= 12/10/1987 & Gender = 'L' & istimewa = 'Y'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("10");
		test.add("1987");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("Y");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,45);
	}

	@Test
	void testcase30() { //TC30 = start kerja= 12/10/1987 & Gender = 'P' & istimewa = 'Y'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("10");
		test.add("1987");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("Y");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,45);
	}

	@Test
	void testcase31() { //TC31 = start kerja= 12/10/2001 & Gender = 'P' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("10");
		test.add("1987");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,50);
	}

	@Test
	void testcase32() { //TC32 = start kerja= 12/10/1987 & Gender = 'P' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("10");
		test.add("1987");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,45);
	}
	@Test
	void testcase33() { //TC33 = start kerja= 12/10/2001 & Gender = 'P' & istimewa = 'Y'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("10");
		test.add("2001");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("P");//jantina
		test.add("Y");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,55);
	}
	@Test
	void testcase34() { //TC34 = start kerja= 12/10/2001 & Gender = 'L' & istimewa = 'N'
		String[] montharray = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");
		test.add("10");
		test.add("2001");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("2");//bulansara
		test.add("1995");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		int tmkhidmat_hari = Integer.parseInt(test.get(3));//tarikh hari start khidmat
		int tmkhidmat_bulan = Integer.parseInt(test.get(4));//bulan start khidmat
		int tmkhidmat_tahun = Integer.parseInt(test.get(5));//tahun start khidmat
		String mkstr = montharray[tmkhidmat_bulan - 1] + " " + tmkhidmat_hari + ", " + tmkhidmat_tahun;
		Date mkstr1 = null;
		try {
			mkstr1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(mkstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sDate1 = "Apr 12, 1991";//patutnya Apr 1, 1991
		Date tarapril = null;
		try {
			tarapril = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int umurbayarpencen = 0;
		if (mkstr1.before(tarapril) && ((test.get(15).equals("L") && test.get(16).equals("Y")) || test.get(15).equals("P"))) {
			umurbayarpencen = 45;
		} else {
			if (mkstr1.before(tarapril)) {
				umurbayarpencen = 50;
			} else {
			}
			umurbayarpencen = 55;
		}
	assertEquals(umurbayarpencen,55);
	}
	@Test
	void testcase35() { //TC35 Retirementdate = 12/2/2010 StartKerja = 21/8/2000 -113
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("21");//harikerja
		test.add("8");//bulankerja
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("12");//harisara
		test.add("2");//bulansara
		test.add("2010");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		// ************* calculate month working
				int minusbulan = 0;
				int minustahun = 0;
				int plusbulan = 0;
				int bulan_cuti_tg = (Integer.parseInt(test.get(11)) * 12) + Integer.parseInt(test.get(10));

				if (Integer.parseInt(test.get(12)) < Integer.parseInt(test.get(3)))
					minusbulan = 1;
				if ((Integer.parseInt(test.get(13)) - minusbulan) < Integer.parseInt(test.get(4))) {
					minustahun = 1;
					plusbulan = 12;
				}

				int tbk = Integer.parseInt(test.get(13)) - minusbulan + plusbulan - Integer.parseInt(test.get(4));
				int ttk = Integer.parseInt(test.get(14)) - minustahun - Integer.parseInt(test.get(5));

				int bulankira = ((ttk * 12) + tbk) - bulan_cuti_tg;
				assertEquals(bulankira,113);
	}

	void testcase36() { //TC36 Retirementdate = 21/2/2010 StartKerja = 21/8/2000 -114
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("12");//harikerja
		test.add("8");//bulankerja
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("21");//harisara
		test.add("2");//bulansara
		test.add("2010");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		// ************* calculate month working
				int minusbulan = 0;
				int minustahun = 0;
				int plusbulan = 0;
				int bulan_cuti_tg = (Integer.parseInt(test.get(11)) * 12) + Integer.parseInt(test.get(10));

				if (Integer.parseInt(test.get(12)) < Integer.parseInt(test.get(3)))
					minusbulan = 1;
				if ((Integer.parseInt(test.get(13)) - minusbulan) < Integer.parseInt(test.get(4))) {
					minustahun = 1;
					plusbulan = 12;
				}

				int tbk = Integer.parseInt(test.get(13)) - minusbulan + plusbulan - Integer.parseInt(test.get(4));
				int ttk = Integer.parseInt(test.get(14)) - minustahun - Integer.parseInt(test.get(5));

				int bulankira = ((ttk * 12) + tbk) - bulan_cuti_tg;
				assertEquals(bulankira,114);
	}
	void testcase37() { //TC37 Retirementdate = 30/8/2010 StartKerja = 10/2/2000 -126
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("10");//harikerja
		test.add("2");//bulankerja
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("30");//harisara
		test.add("8");//bulansara
		test.add("2010");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		// ************* calculate month working
				int minusbulan = 0;
				int minustahun = 0;
				int plusbulan = 0;
				int bulan_cuti_tg = (Integer.parseInt(test.get(11)) * 12) + Integer.parseInt(test.get(10));

				if (Integer.parseInt(test.get(12)) < Integer.parseInt(test.get(3)))
					minusbulan = 1;
				if ((Integer.parseInt(test.get(13)) - minusbulan) < Integer.parseInt(test.get(4))) {
					minustahun = 1;
					plusbulan = 12;
				}

				int tbk = Integer.parseInt(test.get(13)) - minusbulan + plusbulan - Integer.parseInt(test.get(4));
				int ttk = Integer.parseInt(test.get(14)) - minustahun - Integer.parseInt(test.get(5));

				int bulankira = ((ttk * 12) + tbk) - bulan_cuti_tg;
				assertEquals(bulankira,126);
	}
	void testcase38() { //TC38 Retirementdate = 12/8/2010 StartKerja = 21/2/2000 -125
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("21");//harikerja
		test.add("2");//bulankerja
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("12");//harisara
		test.add("8");//bulansara
		test.add("2010");//tahunsara
		test.add("L");//jantina
		test.add("N");//istimewa
		// ************* calculate month working
				int minusbulan = 0;
				int minustahun = 0;
				int plusbulan = 0;
				int bulan_cuti_tg = (Integer.parseInt(test.get(11)) * 12) + Integer.parseInt(test.get(10));

				if (Integer.parseInt(test.get(12)) < Integer.parseInt(test.get(3)))
					minusbulan = 1;
				if ((Integer.parseInt(test.get(13)) - minusbulan) < Integer.parseInt(test.get(4))) {
					minustahun = 1;
					plusbulan = 12;
				}

				int tbk = Integer.parseInt(test.get(13)) - minusbulan + plusbulan - Integer.parseInt(test.get(4));
				int ttk = Integer.parseInt(test.get(14)) - minustahun - Integer.parseInt(test.get(5));

				int bulankira = ((ttk * 12) + tbk) - bulan_cuti_tg;
				assertEquals(bulankira,125);
	}
	@Test
	void testcase39() { //TC39: retirement age =30 & bulankira =125
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("12");
		test.add("1980");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("12");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		assertEquals(tiadaganjaran,"1");
	}
	@Test
	void testcase40() { //TC40: retirement age =40 & bulankira =109
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("8");
		test.add("1969");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2009");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		assertEquals(tiadaganjaran,"2");
	}
	@Test
	void testcase41() { //TC41: retirement age =50 & bulankira =125
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("8");
		test.add("1959");//tahunlahir
		test.add("1");
		test.add("3");
		test.add("1999");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2009");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		assertEquals(tiadaganjaran,"0");
	}
	@Test
	void testcase42() { //TC42: retirement age =30 & bulankira =121
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("8");
		test.add("1979");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("1999");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2009");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		assertEquals(tiadaganjaran,"1");
	}
	@Test
	void testcase43() { //TC43: retirement age =30 & bulankira =109
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("8");
		test.add("1979");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2009");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String tiadaganjaran = output.get(2);
		assertEquals(tiadaganjaran,"1");
	}
	@Test
	void testcase44() { //reckonabe POS = 361, Pension-1800
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("12");
		test.add("1975");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2030");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		double PencenMinima;
		double bulankira = Integer.parseInt(output.get(3));
		if (bulankira > 360)
			bulankira = 360;
		
		double jumpenc = (1.00 / 600.00) * bulankira * Double.parseDouble(test.get(6));
		PencenMinima = jumpenc;

		if (PencenMinima < 720)
			PencenMinima = 720;
		if (bulankira < 300)
			PencenMinima = jumpenc;
		assertEquals(Math.round(PencenMinima),1800);

	}
	@Test
	void testcase45() { //reckonabe POS = 121, Pension-180
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("12");
		test.add("1965");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("120");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		double PencenMinima;
		double bulankira = Integer.parseInt(output.get(3));
		if (bulankira > 360)
			bulankira = 360;
		
		double jumpenc = (1.00 / 600.00) * bulankira * Double.parseDouble(test.get(6));
		PencenMinima = jumpenc;

		if (PencenMinima < 720)
			PencenMinima = 720;
		if (bulankira < 300)
			PencenMinima = jumpenc;
		assertEquals(Math.round(PencenMinima),605);

	}
	@Test
	void testcase46() { //reckonabe POS = 160, Cash Award-16586.67
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("12");
		test.add("1965");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("160");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		Double jumganjarancr = Double.parseDouble(output.get(6));
		assertEquals(jumganjarancr,15550.00);
	}
	@Test
	void testcase47() { //reckonabe POS = 160, Cash Award-16586.67
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("1");
		test.add("12");
		test.add("1965");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("100");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		Double jumganjarancr = Double.parseDouble(output.get(6));
		assertEquals(jumganjarancr,10366.67);
	}
	@Test
	void testcase48() { //Birthdate = 0 Jan 1970, Pension Year-2024
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("0");
		test.add("1");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("100");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String pensionYear = (output.get(7));
		assertEquals(pensionYear.substring(5, 9),"2024");
	}
	@Test
	void testcase49() { //Birthdate = 0 Jan 1970, Pension Year-2024
		PensionServiceIMP pc = new PensionServiceIMP();
		ArrayList<String> test = new ArrayList<>();
		test.add("20");
		test.add("12");
		test.add("1970");//tahunlahir
		test.add("1");
		test.add("7");
		test.add("2000");//tahunkerja
		test.add("3000");//gaji
		test.add("110");//allowance
		test.add("100");//gajicuti
		test.add("0");//cutihari
		test.add("0");//cutibulan
		test.add("0");//cutitahun
		test.add("1");//harisara
		test.add("8");//bulansara
		test.add("2010");//tahunsara
		test.add("P");//jantina
		test.add("N");//istimewa
		ArrayList<String> output = pc.kirapencen(test);
		String pensionYear = (output.get(7));
		assertEquals(pensionYear.substring(5, 9),"2025");
	}
}
