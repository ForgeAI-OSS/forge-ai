# Security Policy

Thank you for helping keep **ForgeAI** and its community safe.

The security of our users and contributors is a top priority. We appreciate responsible disclosure of security vulnerabilities and will work with reporters to investigate and resolve valid issues as quickly as possible.

---

# Supported Versions

We provide security updates for the latest stable releases.

| Version | Supported |
|----------|-----------|
| Latest Stable | ✅ Yes |
| Previous Stable | ✅ Yes |
| Older Releases | ❌ No |
| Development / Pre-release | ⚠ Best Effort |

If you are using an unsupported version, please upgrade before reporting a vulnerability.

---

# Reporting a Vulnerability

**Please do NOT report security vulnerabilities through public GitHub Issues or Discussions.**

Instead, report them privately by emailing:

**security@forgeai.dev**

Include as much information as possible:

- Description of the vulnerability
- Steps to reproduce
- Proof of Concept (if available)
- Affected version(s)
- Environment details
- Potential impact
- Suggested mitigation (optional)

The more detail you provide, the faster we can investigate.

---

# What to Expect

After receiving your report:

- **Within 48 hours**
  - We will acknowledge receipt of your report.

- **Within 7 days**
  - We will provide an initial assessment or request additional information.

- **As soon as possible**
  - We will investigate, validate, and begin working on a fix if the report is confirmed.

- **After a fix is available**
  - We will coordinate responsible disclosure and publish a security advisory when appropriate.

Please note that complex vulnerabilities may require additional investigation time.

---

# Responsible Disclosure

We ask that you:

- Keep vulnerability details private until a fix is available.
- Avoid publicly disclosing or discussing the issue before coordinated disclosure.
- Avoid accessing, modifying, or deleting data that does not belong to you.
- Avoid disrupting services or degrading the experience for other users.
- Only test against systems you own or have explicit permission to test.

We appreciate responsible security research that helps improve ForgeAI.

---

# Scope

This policy applies to:

- ForgeAI source code
- Official ForgeAI repositories
- Official ForgeAI releases
- Official Docker images
- Official SDKs
- Official documentation website

Third-party libraries and services should be reported to their respective maintainers.

---

# Out of Scope

The following are generally considered out of scope:

- Vulnerabilities in unsupported versions
- Social engineering attacks
- Denial-of-Service (DoS) testing
- Physical attacks
- Missing security headers without exploitability
- Issues caused solely by third-party dependencies (unless introduced by ForgeAI)
- Low-risk configuration recommendations without a demonstrable security impact

---

# Security Best Practices for Contributors

When contributing code:

- Never commit secrets, API keys, passwords, or certificates.
- Do not hardcode credentials.
- Validate all external input.
- Follow the principle of least privilege.
- Keep dependencies up to date.
- Write secure, defensive code.
- Add tests for security-sensitive changes where appropriate.

---

# Dependency Security

ForgeAI uses automated dependency scanning and security tooling to identify known vulnerabilities.

Contributors should:

- Keep dependencies updated.
- Address security advisories promptly.
- Avoid introducing unmaintained packages.

---

# AI & LLM Security

Because ForgeAI focuses on AI applications, contributors should also consider:

- Prompt injection attacks
- Prompt leakage
- Jailbreak attempts
- Sensitive data exposure
- Unsafe tool execution
- Model hallucination risks
- Retrieval-Augmented Generation (RAG) data poisoning
- Vector database access controls
- Secure handling of API keys and model credentials

Security reviews should consider both traditional software vulnerabilities and AI-specific attack vectors.

---

# Security Advisories

Confirmed security vulnerabilities will be disclosed through:

- GitHub Security Advisories
- Release notes
- Project changelog

When appropriate, CVE identifiers may be requested and included.

---

# Recognition

We appreciate the efforts of security researchers who help improve ForgeAI.

With your permission, we may acknowledge your contribution in release notes or a future Hall of Fame.

---

# Questions

For general security questions or best practices, please open a GitHub Discussion.

For sensitive matters, contact:

**security@forgeai.dev**

---

Thank you for helping make ForgeAI secure for everyone.