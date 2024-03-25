package lotto.domain;

public class WinningTicket {
    private final LottoTicket winningNumbers;
    private final LottoNumber bonusNumber;

    public WinningTicket(String[] winningNumbers, String bonusNumber) {
        this.winningNumbers = new LottoTicket(winningNumbers);
        this.bonusNumber = createBonusBall(bonusNumber);
    }

    private LottoNumber createBonusBall(String input) {
        LottoNumber bonusBall = new LottoNumber(input);
        if (winningNumbers.contains(bonusBall)) {
            throw new IllegalArgumentException("보너스 숫자는 당첨숫자를 제외한 숫자여야 합니다.");
        }

        return bonusBall;
    }

    public LottoTicket getWinningNumbers() {
        return winningNumbers;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }
}
