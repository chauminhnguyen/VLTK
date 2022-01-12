enum class eHe {
    He_Kim, He_Thuy, He_Tho, He_Moc, He_Hoa
}

enum class eMonPhai() {
    Thieu_Lam, Thien_Vuong_bang, Nga_My, Thuy_Yen_mon, Con_Lon, Vo_Dang, Ngu_Doc_giao, Duong_Mon, Cai_Bang, Thien_Nhan_giao
}

fun getHe(monPhai: eMonPhai): eHe {
    return when(monPhai) {
        eMonPhai.Thieu_Lam -> eHe.He_Kim
        eMonPhai.Thien_Vuong_bang -> eHe.He_Kim
        eMonPhai.Nga_My -> eHe.He_Thuy
        eMonPhai.Thuy_Yen_mon -> eHe.He_Thuy
        eMonPhai.Con_Lon -> eHe.He_Tho
        eMonPhai.Vo_Dang -> eHe.He_Tho
        eMonPhai.Ngu_Doc_giao -> eHe.He_Moc
        eMonPhai.Duong_Mon -> eHe.He_Moc
        eMonPhai.Cai_Bang -> eHe.He_Hoa
        eMonPhai.Thien_Nhan_giao -> eHe.He_Hoa
    }
}

class NhanVat(TenNhanVat: String, Level: Int, MonPhai: eMonPhai, Mau: Int) : IInteract {
    val tenNhanVat: String = TenNhanVat
    var level: Int = Level
    var monPhai: eMonPhai = MonPhai
    var mucSatThuong: Int = 0
    private var mau: Int = Mau

    init {
        this.mucSatThuong = this.level * 5
    }

    fun TakeDamage(enemy_He: eHe, enemy_damage: Int) {
        val our_He: eHe = getHe(this.monPhai)
        val damage = super<IInteract>.TakeDamage(our_He, enemy_He, enemy_damage)

        println("damage NV taken: $damage")
        this.mau -= damage
    }
}