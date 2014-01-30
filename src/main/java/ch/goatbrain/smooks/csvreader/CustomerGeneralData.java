/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

import org.apache.commons.lang.StringUtils;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 30.01.2014 13:46:42
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class CustomerGeneralData extends AbstractCsvDataClass {

    private static String csvFields = "KUNNR,AUFSD,ANRED,BRSCH,KTOKD,WUE_ZZKTOST,LAND1,LOEVM,NAME1,NAME2,NAME3,NAME4,LIFSD,ORT1,ORT2,PFACH,PSTLZ,PSTL2,SORTL,SPRAS,STRAS,TELF1,TELF2,TELFX,KATR5,KATR7,PFORT,VBUND,ZZAORT,ZZSTAT,ZZEMAIL,WUE_ZZBUKRS,WUE_ZZVKNUM,ZZLOEGR,KATR2,STCEG,STCD1,STCD2,REGION,JMZAH,STKZN,STCD3,STCD4,STKZA,KATR8,ERDAT,KATR6,TELBX,STCD5,KNURL,STKZU,STCDT,LIFNR,BAHNE,LOCCO,BAHNS,GFORM,TAXFREEDECL,SHIPTOPARTY_KEY,PARVW,DEPFA,AKONT,KNRZE,ZAHLS,KNB1_ZTERM,ZWELS,KVERM,ALTKN,ZINRT,VZSKZ,ZUAWA,XAUSZ,TOGRU,MAHNA,BUSAB,MANSP,KKBER,KLIMK,KNKLI,WUE_ZZKRED,CTLPC,SPART,AUTLF,KZTLF,ANTLF,KZAZU,LPRIO,VSBED,MRNKZ,PERFK,ZTERM,KVGR1,KVGR2,KVGR3,KVGR4,KVGR5,WUE_ZZXEINZEL,WUE_ZZKLKZ,WUE_ZZOMKZ,WUE_ZZAKL7,WUE_ZZAKL12,WUE_ZZAKL17,WUE_ZZAKL18,WUE_ZZAKL30,WUE_ZZPRDA,KLABC,WUE_ZZKLABCVJ,WUE_ZZAKL31,WUE_ZZNETKK,WUE_SSF_VDAY,WUE_SSF_VFREQ,WUE_SSF_VFUNIT,WUE_SSF_LVISIT,WUE_SSF_CCUST,WUE_SSF_SCUST,WUE_SSF_VCUST,WUE_ZZRZSK,PLTYP,VWERK,WUE_EX_CODE,WAERS,WUE_ZZARTF,WUE_ZZAKL20,EIKTO,PERRL,WUE_ZZAKL49,WUE_ZZAKL16,WUE_SSF_NVISIT,WUE_ZZAKL48,KURST,ZZEAKZ";
    private String KUNNR;
    private String AUFSD;
    private String ANRED;
    private String BRSCH;
    private String KTOKD;
    private String WUE_ZZKTOST;
    private String LAND1;
    private String LOEVM;
    private String NAME1;
    private String NAME2;
    private String NAME3;
    private String NAME4;
    private String LIFSD;
    private String ORT1;
    private String ORT2;
    private String PFACH;
    private String PSTLZ;
    private String PSTL2;
    private String SORTL;
    private String SPRAS;
    private String STRAS;
    private String TELF1;
    private String TELF2;
    private String TELFX;
    private String KATR5;
    private String KATR7;
    private String PFORT;
    private String VBUND;
    private String ZZAORT;
    private String ZZSTAT;
    private String ZZEMAIL;
    private String WUE_ZZBUKRS;
    private String WUE_ZZVKNUM;
    private String ZZLOEGR;
    private String KATR2;
    private String STCEG;
    private String STCD1;
    private String STCD2;
    private String REGION;
    private String JMZAH;
    private String STKZN;
    private String STCD3;
    private String STCD4;
    private String STKZA;
    private String KATR8;
    private String ERDAT;
    private String KATR6;
    private String TELBX;
    private String STCD5;
    private String KNURL;
    private String STKZU;
    private String STCDT;
    private String LIFNR;
    private String BAHNE;
    private String LOCCO;
    private String BAHNS;
    private String GFORM;
    private String TAXFREEDECL;
    private String SHIPTOPARTY_KEY;
    private String PARVW;
    private String DEPFA;
    private String AKONT;
    private String KNRZE;
    private String ZAHLS;
    private String KNB1_ZTERM;
    private String ZWELS;
    private String KVERM;
    private String ALTKN;
    private String ZINRT;
    private String VZSKZ;
    private String ZUAWA;
    private String XAUSZ;
    private String TOGRU;
    private String MAHNA;
    private String BUSAB;
    private String MANSP;
    private String KKBER;
    private String KLIMK;
    private String KNKLI;
    private String WUE_ZZKRED;
    private String CTLPC;
    private String SPART;
    private String AUTLF;
    private String KZTLF;
    private String ANTLF;
    private String KZAZU;
    private String LPRIO;
    private String VSBED;
    private String MRNKZ;
    private String PERFK;
    private String ZTERM;
    private String KVGR1;
    private String KVGR2;
    private String KVGR3;
    private String KVGR4;
    private String KVGR5;
    private String WUE_ZZXEINZEL;
    private String WUE_ZZKLKZ;
    private String WUE_ZZOMKZ;
    private String WUE_ZZAKL7;
    private String WUE_ZZAKL12;
    private String WUE_ZZAKL17;
    private String WUE_ZZAKL18;
    private String WUE_ZZAKL30;
    private String WUE_ZZPRDA;
    private String KLABC;
    private String WUE_ZZKLABCVJ;
    private String WUE_ZZAKL31;
    private String WUE_ZZNETKK;
    private String WUE_SSF_VDAY;
    private String WUE_SSF_VFREQ;
    private String WUE_SSF_VFUNIT;
    private String WUE_SSF_LVISIT;
    private String WUE_SSF_CCUST;
    private String WUE_SSF_SCUST;
    private String WUE_SSF_VCUST;
    private String WUE_ZZRZSK;
    private String PLTYP;
    private String VWERK;
    private String WUE_EX_CODE;
    private String WAERS;
    private String WUE_ZZARTF;
    private String WUE_ZZAKL20;
    private String EIKTO;
    private String PERRL;
    private String WUE_ZZAKL49;
    private String WUE_ZZAKL16;
    private String WUE_SSF_NVISIT;
    private String WUE_ZZAKL48;
    private String KURST;
    private String ZZEAKZ;

    public static String getCsvFields() {
        return csvFields;
    }

    public static int getNofFields() {
        return StringUtils.countMatches(csvFields, String.valueOf(",")) + 1;
    }

    public String getKUNNR() {
        return KUNNR;
    }

    public void setKUNNR(String KUNNR) {
        this.KUNNR = KUNNR;
    }

    public String getAUFSD() {
        return AUFSD;
    }

    public void setAUFSD(String AUFSD) {
        this.AUFSD = AUFSD;
    }

    public String getANRED() {
        return ANRED;
    }

    public void setANRED(String ANRED) {
        this.ANRED = ANRED;
    }

    public String getBRSCH() {
        return BRSCH;
    }

    public void setBRSCH(String BRSCH) {
        this.BRSCH = BRSCH;
    }

    public String getKTOKD() {
        return KTOKD;
    }

    public void setKTOKD(String KTOKD) {
        this.KTOKD = KTOKD;
    }

    public String getWUE_ZZKTOST() {
        return WUE_ZZKTOST;
    }

    public void setWUE_ZZKTOST(String WUE_ZZKTOST) {
        this.WUE_ZZKTOST = WUE_ZZKTOST;
    }

    public String getLAND1() {
        return LAND1;
    }

    public void setLAND1(String LAND1) {
        this.LAND1 = LAND1;
    }

    public String getLOEVM() {
        return LOEVM;
    }

    public void setLOEVM(String LOEVM) {
        this.LOEVM = LOEVM;
    }

    public String getNAME1() {
        return NAME1;
    }

    public void setNAME1(String NAME1) {
        this.NAME1 = NAME1;
    }

    public String getNAME2() {
        return NAME2;
    }

    public void setNAME2(String NAME2) {
        this.NAME2 = NAME2;
    }

    public String getNAME3() {
        return NAME3;
    }

    public void setNAME3(String NAME3) {
        this.NAME3 = NAME3;
    }

    public String getNAME4() {
        return NAME4;
    }

    public void setNAME4(String NAME4) {
        this.NAME4 = NAME4;
    }

    public String getLIFSD() {
        return LIFSD;
    }

    public void setLIFSD(String LIFSD) {
        this.LIFSD = LIFSD;
    }

    public String getORT1() {
        return ORT1;
    }

    public void setORT1(String ORT1) {
        this.ORT1 = ORT1;
    }

    public String getORT2() {
        return ORT2;
    }

    public void setORT2(String ORT2) {
        this.ORT2 = ORT2;
    }

    public String getPFACH() {
        return PFACH;
    }

    public void setPFACH(String PFACH) {
        this.PFACH = PFACH;
    }

    public String getPSTLZ() {
        return PSTLZ;
    }

    public void setPSTLZ(String PSTLZ) {
        this.PSTLZ = PSTLZ;
    }

    public String getPSTL2() {
        return PSTL2;
    }

    public void setPSTL2(String PSTL2) {
        this.PSTL2 = PSTL2;
    }

    public String getSORTL() {
        return SORTL;
    }

    public void setSORTL(String SORTL) {
        this.SORTL = SORTL;
    }

    public String getSPRAS() {
        return SPRAS;
    }

    public void setSPRAS(String SPRAS) {
        this.SPRAS = SPRAS;
    }

    public String getSTRAS() {
        return STRAS;
    }

    public void setSTRAS(String STRAS) {
        this.STRAS = STRAS;
    }

    public String getTELF1() {
        return TELF1;
    }

    public void setTELF1(String TELF1) {
        this.TELF1 = TELF1;
    }

    public String getTELF2() {
        return TELF2;
    }

    public void setTELF2(String TELF2) {
        this.TELF2 = TELF2;
    }

    public String getTELFX() {
        return TELFX;
    }

    public void setTELFX(String TELFX) {
        this.TELFX = TELFX;
    }

    public String getKATR5() {
        return KATR5;
    }

    public void setKATR5(String KATR5) {
        this.KATR5 = KATR5;
    }

    public String getKATR7() {
        return KATR7;
    }

    public void setKATR7(String KATR7) {
        this.KATR7 = KATR7;
    }

    public String getPFORT() {
        return PFORT;
    }

    public void setPFORT(String PFORT) {
        this.PFORT = PFORT;
    }

    public String getVBUND() {
        return VBUND;
    }

    public void setVBUND(String VBUND) {
        this.VBUND = VBUND;
    }

    public String getZZAORT() {
        return ZZAORT;
    }

    public void setZZAORT(String ZZAORT) {
        this.ZZAORT = ZZAORT;
    }

    public String getZZSTAT() {
        return ZZSTAT;
    }

    public void setZZSTAT(String ZZSTAT) {
        this.ZZSTAT = ZZSTAT;
    }

    public String getZZEMAIL() {
        return ZZEMAIL;
    }

    public void setZZEMAIL(String ZZEMAIL) {
        this.ZZEMAIL = ZZEMAIL;
    }

    public String getWUE_ZZBUKRS() {
        return WUE_ZZBUKRS;
    }

    public void setWUE_ZZBUKRS(String WUE_ZZBUKRS) {
        this.WUE_ZZBUKRS = WUE_ZZBUKRS;
    }

    public String getWUE_ZZVKNUM() {
        return WUE_ZZVKNUM;
    }

    public void setWUE_ZZVKNUM(String WUE_ZZVKNUM) {
        this.WUE_ZZVKNUM = WUE_ZZVKNUM;
    }

    public String getZZLOEGR() {
        return ZZLOEGR;
    }

    public void setZZLOEGR(String ZZLOEGR) {
        this.ZZLOEGR = ZZLOEGR;
    }

    public String getKATR2() {
        return KATR2;
    }

    public void setKATR2(String KATR2) {
        this.KATR2 = KATR2;
    }

    public String getSTCEG() {
        return STCEG;
    }

    public void setSTCEG(String STCEG) {
        this.STCEG = STCEG;
    }

    public String getSTCD1() {
        return STCD1;
    }

    public void setSTCD1(String STCD1) {
        this.STCD1 = STCD1;
    }

    public String getSTCD2() {
        return STCD2;
    }

    public void setSTCD2(String STCD2) {
        this.STCD2 = STCD2;
    }

    public String getREGION() {
        return REGION;
    }

    public void setREGION(String REGION) {
        this.REGION = REGION;
    }

    public String getJMZAH() {
        return JMZAH;
    }

    public void setJMZAH(String JMZAH) {
        this.JMZAH = JMZAH;
    }

    public String getSTKZN() {
        return STKZN;
    }

    public void setSTKZN(String STKZN) {
        this.STKZN = STKZN;
    }

    public String getSTCD3() {
        return STCD3;
    }

    public void setSTCD3(String STCD3) {
        this.STCD3 = STCD3;
    }

    public String getSTCD4() {
        return STCD4;
    }

    public void setSTCD4(String STCD4) {
        this.STCD4 = STCD4;
    }

    public String getSTKZA() {
        return STKZA;
    }

    public void setSTKZA(String STKZA) {
        this.STKZA = STKZA;
    }

    public String getKATR8() {
        return KATR8;
    }

    public void setKATR8(String KATR8) {
        this.KATR8 = KATR8;
    }

    public String getERDAT() {
        return ERDAT;
    }

    public void setERDAT(String ERDAT) {
        this.ERDAT = ERDAT;
    }

    public String getKATR6() {
        return KATR6;
    }

    public void setKATR6(String KATR6) {
        this.KATR6 = KATR6;
    }

    public String getTELBX() {
        return TELBX;
    }

    public void setTELBX(String TELBX) {
        this.TELBX = TELBX;
    }

    public String getSTCD5() {
        return STCD5;
    }

    public void setSTCD5(String STCD5) {
        this.STCD5 = STCD5;
    }

    public String getKNURL() {
        return KNURL;
    }

    public void setKNURL(String KNURL) {
        this.KNURL = KNURL;
    }

    public String getSTKZU() {
        return STKZU;
    }

    public void setSTKZU(String STKZU) {
        this.STKZU = STKZU;
    }

    public String getSTCDT() {
        return STCDT;
    }

    public void setSTCDT(String STCDT) {
        this.STCDT = STCDT;
    }

    public String getLIFNR() {
        return LIFNR;
    }

    public void setLIFNR(String LIFNR) {
        this.LIFNR = LIFNR;
    }

    public String getBAHNE() {
        return BAHNE;
    }

    public void setBAHNE(String BAHNE) {
        this.BAHNE = BAHNE;
    }

    public String getLOCCO() {
        return LOCCO;
    }

    public void setLOCCO(String LOCCO) {
        this.LOCCO = LOCCO;
    }

    public String getBAHNS() {
        return BAHNS;
    }

    public void setBAHNS(String BAHNS) {
        this.BAHNS = BAHNS;
    }

    public String getGFORM() {
        return GFORM;
    }

    public void setGFORM(String GFORM) {
        this.GFORM = GFORM;
    }

    public String getTAXFREEDECL() {
        return TAXFREEDECL;
    }

    public void setTAXFREEDECL(String TAXFREEDECL) {
        this.TAXFREEDECL = TAXFREEDECL;
    }

    public String getSHIPTOPARTY_KEY() {
        return SHIPTOPARTY_KEY;
    }

    public void setSHIPTOPARTY_KEY(String SHIPTOPARTY_KEY) {
        this.SHIPTOPARTY_KEY = SHIPTOPARTY_KEY;
    }

    public String getPARVW() {
        return PARVW;
    }

    public void setPARVW(String PARVW) {
        this.PARVW = PARVW;
    }

    public String getDEPFA() {
        return DEPFA;
    }

    public void setDEPFA(String DEPFA) {
        this.DEPFA = DEPFA;
    }

    public String getAKONT() {
        return AKONT;
    }

    public void setAKONT(String AKONT) {
        this.AKONT = AKONT;
    }

    public String getKNRZE() {
        return KNRZE;
    }

    public void setKNRZE(String KNRZE) {
        this.KNRZE = KNRZE;
    }

    public String getZAHLS() {
        return ZAHLS;
    }

    public void setZAHLS(String ZAHLS) {
        this.ZAHLS = ZAHLS;
    }

    public String getKNB1_ZTERM() {
        return KNB1_ZTERM;
    }

    public void setKNB1_ZTERM(String KNB1_ZTERM) {
        this.KNB1_ZTERM = KNB1_ZTERM;
    }

    public String getZWELS() {
        return ZWELS;
    }

    public void setZWELS(String ZWELS) {
        this.ZWELS = ZWELS;
    }

    public String getKVERM() {
        return KVERM;
    }

    public void setKVERM(String KVERM) {
        this.KVERM = KVERM;
    }

    public String getALTKN() {
        return ALTKN;
    }

    public void setALTKN(String ALTKN) {
        this.ALTKN = ALTKN;
    }

    public String getZINRT() {
        return ZINRT;
    }

    public void setZINRT(String ZINRT) {
        this.ZINRT = ZINRT;
    }

    public String getVZSKZ() {
        return VZSKZ;
    }

    public void setVZSKZ(String VZSKZ) {
        this.VZSKZ = VZSKZ;
    }

    public String getZUAWA() {
        return ZUAWA;
    }

    public void setZUAWA(String ZUAWA) {
        this.ZUAWA = ZUAWA;
    }

    public String getXAUSZ() {
        return XAUSZ;
    }

    public void setXAUSZ(String XAUSZ) {
        this.XAUSZ = XAUSZ;
    }

    public String getTOGRU() {
        return TOGRU;
    }

    public void setTOGRU(String TOGRU) {
        this.TOGRU = TOGRU;
    }

    public String getMAHNA() {
        return MAHNA;
    }

    public void setMAHNA(String MAHNA) {
        this.MAHNA = MAHNA;
    }

    public String getBUSAB() {
        return BUSAB;
    }

    public void setBUSAB(String BUSAB) {
        this.BUSAB = BUSAB;
    }

    public String getMANSP() {
        return MANSP;
    }

    public void setMANSP(String MANSP) {
        this.MANSP = MANSP;
    }

    public String getKKBER() {
        return KKBER;
    }

    public void setKKBER(String KKBER) {
        this.KKBER = KKBER;
    }

    public String getKLIMK() {
        return KLIMK;
    }

    public void setKLIMK(String KLIMK) {
        this.KLIMK = KLIMK;
    }

    public String getKNKLI() {
        return KNKLI;
    }

    public void setKNKLI(String KNKLI) {
        this.KNKLI = KNKLI;
    }

    public String getWUE_ZZKRED() {
        return WUE_ZZKRED;
    }

    public void setWUE_ZZKRED(String WUE_ZZKRED) {
        this.WUE_ZZKRED = WUE_ZZKRED;
    }

    public String getCTLPC() {
        return CTLPC;
    }

    public void setCTLPC(String CTLPC) {
        this.CTLPC = CTLPC;
    }

    public String getSPART() {
        return SPART;
    }

    public void setSPART(String SPART) {
        this.SPART = SPART;
    }

    public String getAUTLF() {
        return AUTLF;
    }

    public void setAUTLF(String AUTLF) {
        this.AUTLF = AUTLF;
    }

    public String getKZTLF() {
        return KZTLF;
    }

    public void setKZTLF(String KZTLF) {
        this.KZTLF = KZTLF;
    }

    public String getANTLF() {
        return ANTLF;
    }

    public void setANTLF(String ANTLF) {
        this.ANTLF = ANTLF;
    }

    public String getKZAZU() {
        return KZAZU;
    }

    public void setKZAZU(String KZAZU) {
        this.KZAZU = KZAZU;
    }

    public String getLPRIO() {
        return LPRIO;
    }

    public void setLPRIO(String LPRIO) {
        this.LPRIO = LPRIO;
    }

    public String getVSBED() {
        return VSBED;
    }

    public void setVSBED(String VSBED) {
        this.VSBED = VSBED;
    }

    public String getMRNKZ() {
        return MRNKZ;
    }

    public void setMRNKZ(String MRNKZ) {
        this.MRNKZ = MRNKZ;
    }

    public String getPERFK() {
        return PERFK;
    }

    public void setPERFK(String PERFK) {
        this.PERFK = PERFK;
    }

    public String getZTERM() {
        return ZTERM;
    }

    public void setZTERM(String ZTERM) {
        this.ZTERM = ZTERM;
    }

    public String getKVGR1() {
        return KVGR1;
    }

    public void setKVGR1(String KVGR1) {
        this.KVGR1 = KVGR1;
    }

    public String getKVGR2() {
        return KVGR2;
    }

    public void setKVGR2(String KVGR2) {
        this.KVGR2 = KVGR2;
    }

    public String getKVGR3() {
        return KVGR3;
    }

    public void setKVGR3(String KVGR3) {
        this.KVGR3 = KVGR3;
    }

    public String getKVGR4() {
        return KVGR4;
    }

    public void setKVGR4(String KVGR4) {
        this.KVGR4 = KVGR4;
    }

    public String getKVGR5() {
        return KVGR5;
    }

    public void setKVGR5(String KVGR5) {
        this.KVGR5 = KVGR5;
    }

    public String getWUE_ZZXEINZEL() {
        return WUE_ZZXEINZEL;
    }

    public void setWUE_ZZXEINZEL(String WUE_ZZXEINZEL) {
        this.WUE_ZZXEINZEL = WUE_ZZXEINZEL;
    }

    public String getWUE_ZZKLKZ() {
        return WUE_ZZKLKZ;
    }

    public void setWUE_ZZKLKZ(String WUE_ZZKLKZ) {
        this.WUE_ZZKLKZ = WUE_ZZKLKZ;
    }

    public String getWUE_ZZOMKZ() {
        return WUE_ZZOMKZ;
    }

    public void setWUE_ZZOMKZ(String WUE_ZZOMKZ) {
        this.WUE_ZZOMKZ = WUE_ZZOMKZ;
    }

    public String getWUE_ZZAKL7() {
        return WUE_ZZAKL7;
    }

    public void setWUE_ZZAKL7(String WUE_ZZAKL7) {
        this.WUE_ZZAKL7 = WUE_ZZAKL7;
    }

    public String getWUE_ZZAKL12() {
        return WUE_ZZAKL12;
    }

    public void setWUE_ZZAKL12(String WUE_ZZAKL12) {
        this.WUE_ZZAKL12 = WUE_ZZAKL12;
    }

    public String getWUE_ZZAKL17() {
        return WUE_ZZAKL17;
    }

    public void setWUE_ZZAKL17(String WUE_ZZAKL17) {
        this.WUE_ZZAKL17 = WUE_ZZAKL17;
    }

    public String getWUE_ZZAKL18() {
        return WUE_ZZAKL18;
    }

    public void setWUE_ZZAKL18(String WUE_ZZAKL18) {
        this.WUE_ZZAKL18 = WUE_ZZAKL18;
    }

    public String getWUE_ZZAKL30() {
        return WUE_ZZAKL30;
    }

    public void setWUE_ZZAKL30(String WUE_ZZAKL30) {
        this.WUE_ZZAKL30 = WUE_ZZAKL30;
    }

    public String getWUE_ZZPRDA() {
        return WUE_ZZPRDA;
    }

    public void setWUE_ZZPRDA(String WUE_ZZPRDA) {
        this.WUE_ZZPRDA = WUE_ZZPRDA;
    }

    public String getKLABC() {
        return KLABC;
    }

    public void setKLABC(String KLABC) {
        this.KLABC = KLABC;
    }

    public String getWUE_ZZKLABCVJ() {
        return WUE_ZZKLABCVJ;
    }

    public void setWUE_ZZKLABCVJ(String WUE_ZZKLABCVJ) {
        this.WUE_ZZKLABCVJ = WUE_ZZKLABCVJ;
    }

    public String getWUE_ZZAKL31() {
        return WUE_ZZAKL31;
    }

    public void setWUE_ZZAKL31(String WUE_ZZAKL31) {
        this.WUE_ZZAKL31 = WUE_ZZAKL31;
    }

    public String getWUE_ZZNETKK() {
        return WUE_ZZNETKK;
    }

    public void setWUE_ZZNETKK(String WUE_ZZNETKK) {
        this.WUE_ZZNETKK = WUE_ZZNETKK;
    }

    public String getWUE_SSF_VDAY() {
        return WUE_SSF_VDAY;
    }

    public void setWUE_SSF_VDAY(String WUE_SSF_VDAY) {
        this.WUE_SSF_VDAY = WUE_SSF_VDAY;
    }

    public String getWUE_SSF_VFREQ() {
        return WUE_SSF_VFREQ;
    }

    public void setWUE_SSF_VFREQ(String WUE_SSF_VFREQ) {
        this.WUE_SSF_VFREQ = WUE_SSF_VFREQ;
    }

    public String getWUE_SSF_VFUNIT() {
        return WUE_SSF_VFUNIT;
    }

    public void setWUE_SSF_VFUNIT(String WUE_SSF_VFUNIT) {
        this.WUE_SSF_VFUNIT = WUE_SSF_VFUNIT;
    }

    public String getWUE_SSF_LVISIT() {
        return WUE_SSF_LVISIT;
    }

    public void setWUE_SSF_LVISIT(String WUE_SSF_LVISIT) {
        this.WUE_SSF_LVISIT = WUE_SSF_LVISIT;
    }

    public String getWUE_SSF_CCUST() {
        return WUE_SSF_CCUST;
    }

    public void setWUE_SSF_CCUST(String WUE_SSF_CCUST) {
        this.WUE_SSF_CCUST = WUE_SSF_CCUST;
    }

    public String getWUE_SSF_SCUST() {
        return WUE_SSF_SCUST;
    }

    public void setWUE_SSF_SCUST(String WUE_SSF_SCUST) {
        this.WUE_SSF_SCUST = WUE_SSF_SCUST;
    }

    public String getWUE_SSF_VCUST() {
        return WUE_SSF_VCUST;
    }

    public void setWUE_SSF_VCUST(String WUE_SSF_VCUST) {
        this.WUE_SSF_VCUST = WUE_SSF_VCUST;
    }

    public String getWUE_ZZRZSK() {
        return WUE_ZZRZSK;
    }

    public void setWUE_ZZRZSK(String WUE_ZZRZSK) {
        this.WUE_ZZRZSK = WUE_ZZRZSK;
    }

    public String getPLTYP() {
        return PLTYP;
    }

    public void setPLTYP(String PLTYP) {
        this.PLTYP = PLTYP;
    }

    public String getVWERK() {
        return VWERK;
    }

    public void setVWERK(String VWERK) {
        this.VWERK = VWERK;
    }

    public String getWUE_EX_CODE() {
        return WUE_EX_CODE;
    }

    public void setWUE_EX_CODE(String WUE_EX_CODE) {
        this.WUE_EX_CODE = WUE_EX_CODE;
    }

    public String getWAERS() {
        return WAERS;
    }

    public void setWAERS(String WAERS) {
        this.WAERS = WAERS;
    }

    public String getWUE_ZZARTF() {
        return WUE_ZZARTF;
    }

    public void setWUE_ZZARTF(String WUE_ZZARTF) {
        this.WUE_ZZARTF = WUE_ZZARTF;
    }

    public String getWUE_ZZAKL20() {
        return WUE_ZZAKL20;
    }

    public void setWUE_ZZAKL20(String WUE_ZZAKL20) {
        this.WUE_ZZAKL20 = WUE_ZZAKL20;
    }

    public String getEIKTO() {
        return EIKTO;
    }

    public void setEIKTO(String EIKTO) {
        this.EIKTO = EIKTO;
    }

    public String getPERRL() {
        return PERRL;
    }

    public void setPERRL(String PERRL) {
        this.PERRL = PERRL;
    }

    public String getWUE_ZZAKL49() {
        return WUE_ZZAKL49;
    }

    public void setWUE_ZZAKL49(String WUE_ZZAKL49) {
        this.WUE_ZZAKL49 = WUE_ZZAKL49;
    }

    public String getWUE_ZZAKL16() {
        return WUE_ZZAKL16;
    }

    public void setWUE_ZZAKL16(String WUE_ZZAKL16) {
        this.WUE_ZZAKL16 = WUE_ZZAKL16;
    }

    public String getWUE_SSF_NVISIT() {
        return WUE_SSF_NVISIT;
    }

    public void setWUE_SSF_NVISIT(String WUE_SSF_NVISIT) {
        this.WUE_SSF_NVISIT = WUE_SSF_NVISIT;
    }

    public String getWUE_ZZAKL48() {
        return WUE_ZZAKL48;
    }

    public void setWUE_ZZAKL48(String WUE_ZZAKL48) {
        this.WUE_ZZAKL48 = WUE_ZZAKL48;
    }

    public String getKURST() {
        return KURST;
    }

    public void setKURST(String KURST) {
        this.KURST = KURST;
    }

    public String getZZEAKZ() {
        return ZZEAKZ;
    }

    public void setZZEAKZ(String ZZEAKZ) {
        this.ZZEAKZ = ZZEAKZ;
    }

    public String toCsvString() {
        return KUNNR + separatorChar + AUFSD + separatorChar + ANRED + separatorChar + BRSCH + separatorChar + KTOKD + separatorChar + WUE_ZZKTOST + separatorChar + LAND1 + separatorChar + LOEVM + separatorChar + NAME1 + separatorChar + NAME2 + separatorChar + NAME3 + separatorChar + NAME4 + separatorChar + LIFSD + separatorChar + ORT1 + separatorChar + ORT2 + separatorChar + PFACH + separatorChar + PSTLZ + separatorChar + PSTL2 + separatorChar + SORTL + separatorChar + SPRAS + separatorChar + STRAS + separatorChar + TELF1 + separatorChar + TELF2 + separatorChar + TELFX + separatorChar + KATR5 + separatorChar + KATR7 + separatorChar + PFORT + separatorChar + VBUND + separatorChar + ZZAORT + separatorChar + ZZSTAT + separatorChar + ZZEMAIL + separatorChar + WUE_ZZBUKRS + separatorChar + WUE_ZZVKNUM + separatorChar + ZZLOEGR + separatorChar + KATR2 + separatorChar + STCEG + separatorChar + STCD1 + separatorChar + STCD2 + separatorChar + REGION + separatorChar + JMZAH + separatorChar + STKZN + separatorChar + STCD3 + separatorChar + STCD4 + separatorChar + STKZA + separatorChar + KATR8 + separatorChar + ERDAT + separatorChar + KATR6 + separatorChar + TELBX + separatorChar + STCD5 + separatorChar + KNURL + separatorChar + STKZU + separatorChar + STCDT + separatorChar + LIFNR + separatorChar + BAHNE + separatorChar + LOCCO + separatorChar + BAHNS + separatorChar + GFORM + separatorChar + TAXFREEDECL + separatorChar + SHIPTOPARTY_KEY + separatorChar + PARVW + separatorChar + DEPFA + separatorChar + AKONT + separatorChar + KNRZE + separatorChar + ZAHLS + separatorChar + KNB1_ZTERM + separatorChar + ZWELS + separatorChar + KVERM + separatorChar + ALTKN + separatorChar + ZINRT + separatorChar + VZSKZ + separatorChar + ZUAWA + separatorChar + XAUSZ + separatorChar + TOGRU + separatorChar + MAHNA + separatorChar + BUSAB + separatorChar + MANSP + separatorChar + KKBER + separatorChar + KLIMK + separatorChar + KNKLI + separatorChar + WUE_ZZKRED + separatorChar + CTLPC + separatorChar + SPART + separatorChar + AUTLF + separatorChar + KZTLF + separatorChar + ANTLF + separatorChar + KZAZU + separatorChar + LPRIO + separatorChar + VSBED + separatorChar + MRNKZ + separatorChar + PERFK + separatorChar + ZTERM + separatorChar + KVGR1 + separatorChar + KVGR2 + separatorChar + KVGR3 + separatorChar + KVGR4 + separatorChar + KVGR5 + separatorChar + WUE_ZZXEINZEL + separatorChar + WUE_ZZKLKZ + separatorChar + WUE_ZZOMKZ + separatorChar + WUE_ZZAKL7 + separatorChar + WUE_ZZAKL12 + separatorChar + WUE_ZZAKL17 + separatorChar + WUE_ZZAKL18 + separatorChar + WUE_ZZAKL30 + separatorChar + WUE_ZZPRDA + separatorChar + KLABC + separatorChar + WUE_ZZKLABCVJ + separatorChar + WUE_ZZAKL31 + separatorChar + WUE_ZZNETKK + separatorChar + WUE_SSF_VDAY + separatorChar + WUE_SSF_VFREQ + separatorChar + WUE_SSF_VFUNIT + separatorChar + WUE_SSF_LVISIT + separatorChar + WUE_SSF_CCUST + separatorChar + WUE_SSF_SCUST + separatorChar + WUE_SSF_VCUST + separatorChar + WUE_ZZRZSK + separatorChar + PLTYP + separatorChar + VWERK + separatorChar + WUE_EX_CODE + separatorChar + WAERS + separatorChar + WUE_ZZARTF + separatorChar + WUE_ZZAKL20 + separatorChar + EIKTO + separatorChar + PERRL + separatorChar + WUE_ZZAKL49 + separatorChar + WUE_ZZAKL16 + separatorChar + WUE_SSF_NVISIT + separatorChar + WUE_ZZAKL48 + separatorChar + KURST + separatorChar + ZZEAKZ;
    }

    @Override
    public String toString() {
        return "CustomerGeneralData{" + "KUNNR=" + KUNNR + ", AUFSD=" + AUFSD + ", ANRED=" + ANRED + ", BRSCH=" + BRSCH + ", KTOKD=" + KTOKD + ", WUE_ZZKTOST=" + WUE_ZZKTOST + ", LAND1=" + LAND1 + ", LOEVM=" + LOEVM + ", NAME1=" + NAME1 + ", NAME2=" + NAME2 + ", NAME3=" + NAME3 + ", NAME4=" + NAME4 + ", LIFSD=" + LIFSD + ", ORT1=" + ORT1 + ", ORT2=" + ORT2 + ", PFACH=" + PFACH + ", PSTLZ=" + PSTLZ + ", PSTL2=" + PSTL2 + ", SORTL=" + SORTL + ", SPRAS=" + SPRAS + ", STRAS=" + STRAS + ", TELF1=" + TELF1 + ", TELF2=" + TELF2 + ", TELFX=" + TELFX + ", KATR5=" + KATR5 + ", KATR7=" + KATR7 + ", PFORT=" + PFORT + ", VBUND=" + VBUND + ", ZZAORT=" + ZZAORT + ", ZZSTAT=" + ZZSTAT + ", ZZEMAIL=" + ZZEMAIL + ", WUE_ZZBUKRS=" + WUE_ZZBUKRS + ", WUE_ZZVKNUM=" + WUE_ZZVKNUM + ", ZZLOEGR=" + ZZLOEGR + ", KATR2=" + KATR2 + ", STCEG=" + STCEG + ", STCD1=" + STCD1 + ", STCD2=" + STCD2 + ", REGION=" + REGION + ", JMZAH=" + JMZAH + ", STKZN=" + STKZN + ", STCD3=" + STCD3 + ", STCD4=" + STCD4 + ", STKZA=" + STKZA + ", KATR8=" + KATR8 + ", ERDAT=" + ERDAT + ", KATR6=" + KATR6 + ", TELBX=" + TELBX + ", STCD5=" + STCD5 + ", KNURL=" + KNURL + ", STKZU=" + STKZU + ", STCDT=" + STCDT + ", LIFNR=" + LIFNR + ", BAHNE=" + BAHNE + ", LOCCO=" + LOCCO + ", BAHNS=" + BAHNS + ", GFORM=" + GFORM + ", TAXFREEDECL=" + TAXFREEDECL + ", SHIPTOPARTY_KEY=" + SHIPTOPARTY_KEY + ", PARVW=" + PARVW + ", DEPFA=" + DEPFA + ", AKONT=" + AKONT + ", KNRZE=" + KNRZE + ", ZAHLS=" + ZAHLS + ", KNB1_ZTERM=" + KNB1_ZTERM + ", ZWELS=" + ZWELS + ", KVERM=" + KVERM + ", ALTKN=" + ALTKN + ", ZINRT=" + ZINRT + ", VZSKZ=" + VZSKZ + ", ZUAWA=" + ZUAWA + ", XAUSZ=" + XAUSZ + ", TOGRU=" + TOGRU + ", MAHNA=" + MAHNA + ", BUSAB=" + BUSAB + ", MANSP=" + MANSP + ", KKBER=" + KKBER + ", KLIMK=" + KLIMK + ", KNKLI=" + KNKLI + ", WUE_ZZKRED=" + WUE_ZZKRED + ", CTLPC=" + CTLPC + ", SPART=" + SPART + ", AUTLF=" + AUTLF + ", KZTLF=" + KZTLF + ", ANTLF=" + ANTLF + ", KZAZU=" + KZAZU + ", LPRIO=" + LPRIO + ", VSBED=" + VSBED + ", MRNKZ=" + MRNKZ + ", PERFK=" + PERFK + ", ZTERM=" + ZTERM + ", KVGR1=" + KVGR1 + ", KVGR2=" + KVGR2 + ", KVGR3=" + KVGR3 + ", KVGR4=" + KVGR4 + ", KVGR5=" + KVGR5 + ", WUE_ZZXEINZEL=" + WUE_ZZXEINZEL + ", WUE_ZZKLKZ=" + WUE_ZZKLKZ + ", WUE_ZZOMKZ=" + WUE_ZZOMKZ + ", WUE_ZZAKL7=" + WUE_ZZAKL7 + ", WUE_ZZAKL12=" + WUE_ZZAKL12 + ", WUE_ZZAKL17=" + WUE_ZZAKL17 + ", WUE_ZZAKL18=" + WUE_ZZAKL18 + ", WUE_ZZAKL30=" + WUE_ZZAKL30 + ", WUE_ZZPRDA=" + WUE_ZZPRDA + ", KLABC=" + KLABC + ", WUE_ZZKLABCVJ=" + WUE_ZZKLABCVJ + ", WUE_ZZAKL31=" + WUE_ZZAKL31 + ", WUE_ZZNETKK=" + WUE_ZZNETKK + ", WUE_SSF_VDAY=" + WUE_SSF_VDAY + ", WUE_SSF_VFREQ=" + WUE_SSF_VFREQ + ", WUE_SSF_VFUNIT=" + WUE_SSF_VFUNIT + ", WUE_SSF_LVISIT=" + WUE_SSF_LVISIT + ", WUE_SSF_CCUST=" + WUE_SSF_CCUST + ", WUE_SSF_SCUST=" + WUE_SSF_SCUST + ", WUE_SSF_VCUST=" + WUE_SSF_VCUST + ", WUE_ZZRZSK=" + WUE_ZZRZSK + ", PLTYP=" + PLTYP + ", VWERK=" + VWERK + ", WUE_EX_CODE=" + WUE_EX_CODE + ", WAERS=" + WAERS + ", WUE_ZZARTF=" + WUE_ZZARTF + ", WUE_ZZAKL20=" + WUE_ZZAKL20 + ", EIKTO=" + EIKTO + ", PERRL=" + PERRL + ", WUE_ZZAKL49=" + WUE_ZZAKL49 + ", WUE_ZZAKL16=" + WUE_ZZAKL16 + ", WUE_SSF_NVISIT=" + WUE_SSF_NVISIT + ", WUE_ZZAKL48=" + WUE_ZZAKL48 + ", KURST=" + KURST + ", ZZEAKZ=" + ZZEAKZ + '}';
    }
}
