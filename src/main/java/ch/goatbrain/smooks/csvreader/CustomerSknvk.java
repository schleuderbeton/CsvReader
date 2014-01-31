/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 31.01.2014 10:24:42
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class CustomerSknvk extends AbstractCsvDataClass {

    public CustomerSknvk() {
        setCsvFields("parau,wue_zzgbdat,titel_ap,knvk_sortl,parh1,parh2,parh3,parh4,parh5");
    }
    private String parau;
    private String wue_zzgbdat;
    private String titel_ap;
    private String knvk_sortl;
    private String parh1;
    private String parh2;
    private String parh3;
    private String parh4;
    private String parh5;

    public String getParau() {
        return parau;
    }

    public void setParau(String parau) {
        this.parau = parau;
    }

    public String getWue_zzgbdat() {
        return wue_zzgbdat;
    }

    public void setWue_zzgbdat(String wue_zzgbdat) {
        this.wue_zzgbdat = wue_zzgbdat;
    }

    public String getTitel_ap() {
        return titel_ap;
    }

    public void setTitel_ap(String titel_ap) {
        this.titel_ap = titel_ap;
    }

    public String getKnvk_sortl() {
        return knvk_sortl;
    }

    public void setKnvk_sortl(String knvk_sortl) {
        this.knvk_sortl = knvk_sortl;
    }

    public String getParh1() {
        return parh1;
    }

    public void setParh1(String parh1) {
        this.parh1 = parh1;
    }

    public String getParh2() {
        return parh2;
    }

    public void setParh2(String parh2) {
        this.parh2 = parh2;
    }

    public String getParh3() {
        return parh3;
    }

    public void setParh3(String parh3) {
        this.parh3 = parh3;
    }

    public String getParh4() {
        return parh4;
    }

    public void setParh4(String parh4) {
        this.parh4 = parh4;
    }

    public String getParh5() {
        return parh5;
    }

    public void setParh5(String parh5) {
        this.parh5 = parh5;
    }

    public String toCsvString() {
        return parau + separatorChar + wue_zzgbdat + separatorChar + titel_ap + separatorChar + knvk_sortl + separatorChar + parh1 + separatorChar + parh2 + separatorChar + parh3 + separatorChar + parh4 + separatorChar + parh5;
    }

    @Override
    public String toString() {
        return "CustomerSknvk{" + "parau=" + parau + ", wue_zzgbdat=" + wue_zzgbdat + ", titel_ap=" + titel_ap + ", knvk_sortl=" + knvk_sortl + ", parh1=" + parh1 + ", parh2=" + parh2 + ", parh3=" + parh3 + ", parh4=" + parh4 + ", parh5=" + parh5 + '}';
    }
}
