package kookmin.software.capstone2023.timebank.domain.repository

import kookmin.software.capstone2023.timebank.domain.model.BankAccount
import kookmin.software.capstone2023.timebank.domain.model.BankAccountTransaction
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

// SpecificationExecutor를 상속해서 동적 쿼리를 사용할 수 있게 한다.
@Repository
interface BankAccountTransactionJpaRepository :
    JpaRepository<BankAccountTransaction, Long>{
    fun findAll(spec: Specification<BankAccountTransaction>, pageable: Pageable): Page<BankAccountTransaction>
}