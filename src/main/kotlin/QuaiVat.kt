open class QuaiVat(Level: Int, He: eHe, Mau: Int) : IInteract{
    var he: eHe = He
    var level: Int = Level
    var mucSatThuong: Int = 0
    private var mau: Int = Mau

    fun TakeDamage(enemy_He: eHe, enemy_damage: Int) {
        val damage = super<IInteract>.TakeDamage(this.he, enemy_He, enemy_damage)

        println("damage QV taken: $damage")
        this.mau -= damage
    }
}

class ThongThuong(Level: Int, He: eHe, Mau: Int) : QuaiVat(Level, He, Mau) {
    init {
        this.mucSatThuong = this.level * 3
    }
}

class DauLinh(Level: Int, He: eHe, Mau: Int) : QuaiVat(Level, He, Mau) {
    init {
        this.mucSatThuong = this.level * 7
    }
}